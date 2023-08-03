package com.example.GRP.controller;

import com.example.USR.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    @GetMapping("/api/group")
    public String getGroupValue(){
        //Entering directly into Service Method
        UserService userService = new UserService();
        return userService.getValue();
    }
}
