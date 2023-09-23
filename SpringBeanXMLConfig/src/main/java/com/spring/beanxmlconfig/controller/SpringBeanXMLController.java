package com.spring.beanxmlconfig.controller;

import com.spring.beanxmlconfig.service.SpringBeanXMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*====================================================
SpringBeanXMLService is @Service
MessageProvider is configured in beans.xml
Address is configured with @Bean under @Configuration
=====================================================*/

@Controller
public class SpringBeanXMLController {

    @Autowired
    SpringBeanXMLService springBeanXMLService;

    @ResponseBody
    @GetMapping("/getData")
    public String getData(){
        String response =  springBeanXMLService.getServiceData();
        return  response;
    }
}
