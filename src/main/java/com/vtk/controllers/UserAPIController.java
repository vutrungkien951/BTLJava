/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.controllers;

import com.vtk.pojo.User;
import com.vtk.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kien
 */
@RestController
@RequestMapping("/api")
public class UserAPIController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/store-owner")
    public ResponseEntity<List<User>> getStoreOwner(){
        return new ResponseEntity<>(
                this.userService.getStoreOwner(),
                HttpStatus.OK
        );
    }
}
