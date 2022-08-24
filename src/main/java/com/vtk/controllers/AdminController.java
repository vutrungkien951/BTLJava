/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.controllers;
            
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kien
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @RequestMapping("/")
    public String index(){
        
        return "admin";
    }
    
    @RequestMapping("/users")
    public String users(){
        
        return "adminUser";
    }
    
}
