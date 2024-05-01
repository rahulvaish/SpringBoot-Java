package com.example.SpringBootArchTesting.util;

import com.example.SpringBootArchTesting.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppUtil {

    @Autowired
    AppService appService;

//     public Integer addition(Integer i, Integer j){
//        return appService.sum(i,j);
//     }
}
