package com.example.SpringBootTimeout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/getDataOne")
    public String getDataOne(){
        try {
            Thread.sleep(10000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return "DataOne";
    }

    @GetMapping("/getDataTwo")
    public String getDataTwo(){
        try {
            Thread.sleep(10000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return "DataTwo";
    }
}