package com.example.USR.controller;

import com.example.USR.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public String getUserValue(){
        UserService userService = new UserService();
        return userService.getValue();
    }
}
