package com.example.profiles.SpringBootProfiles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    Environment environment;

    @Value("${app.propVal}")
    String appPropVal;

    public String getDate() {
        String[] activeProfiles = environment.getActiveProfiles();
        String environments = "";
        for (String env : activeProfiles){
            environments = environments + env;
        }
        return "ENV:["+environments+ "] PROP:"+appPropVal;
    }
}
