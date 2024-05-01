package com.example.SpringBootArchTesting.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AppService {

    public Integer sum(int i, int j){
        return i+j;
    }
}
