/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.controllers;

import com.vtk.services.CategoryService;
import java.util.logging.Logger;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kien
 */
@Controller
@ControllerAdvice
public class IndexController {

    Logger log = Logger.getLogger(IndexController.class.getName());

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute
    public void commonAttribute(Model model) {
        model.addAttribute("categories", this.categoryService.getCategories());
    }

    @RequestMapping("/")
    public String index(Model model) {
        log.info("Index Controller!");

        return "index";
    }
}
