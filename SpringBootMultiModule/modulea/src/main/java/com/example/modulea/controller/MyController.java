package com.example.modulea.controller;

import com.example.modulea.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @ResponseBody
    @GetMapping("/getData")
    public String getDate(){
        return myService.getDate();
    }
}
