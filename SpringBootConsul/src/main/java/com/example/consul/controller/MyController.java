package com.example.consul.controller;

import com.example.consul.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(value = MyConfig.class)
public class MyController {
    @Autowired
    private MyConfig config;

    @GetMapping("/getConfigData")
    public MyConfig getConfiguration() {
        return config;
    }
}
