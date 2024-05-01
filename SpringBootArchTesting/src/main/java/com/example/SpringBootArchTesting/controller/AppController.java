package com.example.SpringBootArchTesting.controller;

import com.example.SpringBootArchTesting.service.AppService;
import com.example.SpringBootArchTesting.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    AppService appService;

    @Autowired
    AppUtil appUtil;

    @GetMapping("/sumA/{i}/{j}")
    public Integer getSumA(@PathVariable Integer i, @PathVariable Integer j){
       return appService.sum(i,j);
    }

//To Fail the test, uncomment below, and uncomment stuff from AppUtil
//    @GetMapping("/sumB/{i}/{j}")
//    public Integer getSumB(@PathVariable Integer i, @PathVariable Integer j){
//        return appUtil.addition(i,j);
//    }
}
