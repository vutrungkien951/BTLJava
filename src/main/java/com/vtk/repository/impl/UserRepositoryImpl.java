/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.repository.impl;

import com.vtk.pojo.User;
import com.vtk.repository.UserRepository;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kien
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public void addUser(User user) {
        try {
            this.sessionFactory.getObject().getCurrentSession().save(user);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public boolean checkUserEmail(String userEmail) {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> cr = builder.createQuery(User.class);

        Root<User> root = cr.from(User.class);
        CriteriaQuery query = cr.select(root);
        query = query.where(builder.equal(root.get("userEmail").as(String.class),
                userEmail));

        //true - doesn't exist userEmail
        //false - exists userEmail
        return (session.createQuery(query).getResultList() == null);
    }

    @Override
    public List<User> getUsers(String userEmail) {
        List<User> users;
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> cr = builder.createQuery(User.class);

        Root<User> root = cr.from(User.class);

        CriteriaQuery<User> query = cr.select(root);
        if (!userEmail.isEmpty()) {
            query.where(builder.equal(root.get("userEmail"), userEmail));
        }

        users = session.createQuery(query).getResultList();

        return users;
    }

    @Override
    public List<User> getStoreOwner() {
        List<User> users;
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> cr = builder.createQuery(User.class);

        Root<User> root = cr.from(User.class);

        CriteriaQuery<User> query = cr.select(root);
        //select store owner
        query.where(builder.equal(root.get("userRole").as(String.class), "ROLE_STORE_OWNER"));
        //select don't active store owner
        query.where(builder.isFalse(root.get("active")));

        users = session.createQuery(query).getResultList();

        return users;
    }

    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> cr = builder.createQuery(User.class);

        Root<User> root = cr.from(User.class);

        CriteriaQuery<User> query = cr.select(root);

        query.where(builder.equal(root.get("userId"), id));

        return session.createQuery(query).getSingleResult();
    }

    @Override
    public void saveUser(User user) {
        sessionFactory.getObject().getCurrentSession().saveOrUpdate(user);
    }

}
