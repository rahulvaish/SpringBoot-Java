package com.example.caching.SpringBootCache.service.impl;

import com.example.caching.SpringBootCache.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    RestTemplate restTemplate;

    public String getData() {
        return callAppService();
    }

    public String callAppService() {
        String url = "http://localhost:8080/product/getAppData";
        return restTemplate.getForObject(url, String.class);
    }
}