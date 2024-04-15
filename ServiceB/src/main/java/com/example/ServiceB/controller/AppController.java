package com.example.ServiceB.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class AppController {

    @GetMapping("/getDataServiceB")
    public String getDataServiceB() {
        log.info("In method getDataServiceB");
        //int i=9/0;// This is result 500 Internal Server Error when making a hit from ServiceA
        //Below operation will result 408 Request Timeout when making a hit from ServiceA
        try{
            Thread.sleep(10000);
        }catch(Exception e){
           e.printStackTrace();
        }
        return "getDataServiceB";
    }
}
