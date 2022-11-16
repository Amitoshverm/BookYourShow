package com.scaler.bookyourshow.controllers;

import com.scaler.bookyourshow.dtos.CreateUserDTO;
import com.scaler.bookyourshow.models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    public User createUser(@RequestBody CreateUserDTO request) {
        if(request.getEmail() == null) {
            throw new RuntimeException("Invalid Request");
        }
        System.out.println("Creating User "+ request);
        return null;
    }
}
