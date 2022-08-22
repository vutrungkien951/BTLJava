/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.vtk.pojo.User;
import com.vtk.services.UserService;
import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kien
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private Cloudinary cloudinary;

    @RequestMapping("/login")
    public String login(Model model) {

        return "login";
    }

    @GetMapping("/signup")
    public String signUp(Model model) {
        model.addAttribute("user", new User());

        return "signup";
    }

    @PostMapping("/signup")
    public String signUpProcess(@ModelAttribute(value = "user") @Valid User user,
            BindingResult result,
            HttpServletRequest request) {
        if (result.hasErrors()) {
            for (Object object : result.getAllErrors()) {
                if (object instanceof FieldError) {
                    FieldError fieldError = (FieldError) object;

                    System.out.println(fieldError.getCode());
                }

                if (object instanceof ObjectError) {
                    ObjectError objectError = (ObjectError) object;

                    System.out.println(objectError.getCode());
                }
            }
            return "redirect:categories";
        }

        try {
            Map results = cloudinary.uploader().upload(user.getImg().getBytes(),
                    ObjectUtils.asMap("resource_type", "auto"));
            user.setUserImage(results.get("secure_url").toString());
            this.userService.addUser(user);
            return "redirect:/";
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        return "redirect:/login";
    }

}
