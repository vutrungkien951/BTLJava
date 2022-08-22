/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.services.impl;

import com.vtk.pojo.User;
import com.vtk.repository.UserRepository;
import com.vtk.services.UserService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author kien
 */
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired 
    private UserRepository userRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void addUser(User user) {
        
        user.setUserPassword(bCryptPasswordEncoder.encode(user.getUserPassword()));
        if("STORE_OWNER".equals(user.getUserRole())){
            user.setActive(Boolean.FALSE);
        }
        else{
            user.setActive(Boolean.TRUE);
        }
        this.userRepository.addUser(user);
    }

    @Override
    public boolean checkUserEmail(String userEmail) {
        return this.userRepository.checkUserEmail(userEmail);
    }

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        List<User> users = this.userRepository.getUsers(userEmail);
        if(users.isEmpty()){
            throw new UsernameNotFoundException("Khong ton tai!");
        }
        User u = users.get(0);
        Set<GrantedAuthority> authorites = new HashSet<>();
        authorites.add(new SimpleGrantedAuthority(u.getUserRole()));
        
        return new org.springframework.security.core.userdetails.User(u.getUserEmail(),
                u.getUserPassword(), authorites);
    }

    @Override
    public User getUserByUserEmail(String userEmail) {
        return this.userRepository.getUsers(userEmail).get(0);
    }
    
}
