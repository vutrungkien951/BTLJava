/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author kien
 */
@Controller
public class CategoryController {
    
    @GetMapping("/categories")
    public String categories(){
        return "categories";
    }
    
    @GetMapping("/categories/${categoryId}/products")
    public String categoryProducts(@PathVariable (value = "categoryId") int categoryId){
        
        
        return "category_product";
    }
}
