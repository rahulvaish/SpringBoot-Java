package com.example.SpringBootArchTesting.controller;

import com.example.SpringBootArchTesting.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    AppService appService;

    @GetMapping("/sum/{i}/{j}")
    public Integer getSum(@PathVariable Integer i, @PathVariable Integer j){
       return appService.sum(i,j);
    }
}
