/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.validator;

import com.vtk.services.UserService;
import javax.persistence.NoResultException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kien
 */
public class UserEmailValidator implements ConstraintValidator<UserEmail, String> {

    @Autowired
    private UserService userService;

    @Override
    public void initialize(UserEmail constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
//            return userService.checkUserEmail(value); ??
              return true;
        } catch (NoResultException ex) {
            return false;
        }
    }

}
