/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.services;

import com.vtk.pojo.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author kien
 */
public interface UserService extends UserDetailsService{
    void addUser(User user);
    boolean checkUserEmail(String userEmail);
    User getUserByUserEmail(String userEmail);
    List<User> getStoreOwner();
}
