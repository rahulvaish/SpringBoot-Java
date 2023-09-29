package com.example.app.SpringBootApp.controller;

import com.example.app.SpringBootApp.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/getAppData")
    public String getAppData(){
        return appService.getAppData();
    }

}
