package com.example.User.controller;

import com.example.User.model.Dept;
import com.example.User.model.ResponseValueObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getData")
    @ResponseBody
    public ResponseValueObject getData(){
        ResponseValueObject responseValueObject = restTemplate.getForObject("http://Department/getDepartmentFromUser", ResponseValueObject.class);
        return responseValueObject;
    }
}

