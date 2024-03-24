package com.example.SpringBootLoadBalancer.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class AppController implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/getData")
    public String getData() {
        WebClient loadBalancedClient = applicationContext.getBean(WebClient.Builder.class).build();
        String result = loadBalancedClient.get().uri("http://example-service/getData")
                        .retrieve().toEntity(String.class)
                        .block().getBody();
        return result;
    }
}
