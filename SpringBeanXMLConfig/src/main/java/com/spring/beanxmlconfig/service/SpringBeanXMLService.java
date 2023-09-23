package com.spring.beanxmlconfig.service;

import com.spring.beanxmlconfig.model.Address;
import com.spring.beanxmlconfig.model.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBeanXMLService {

    @Autowired
    private MessageProvider messageProvider;

    @Autowired
    Address address;

    public String getServiceData(){
        address.setCity("Montreal");
        return "VALUE FROM XML BEAN: "+ messageProvider.getMessage() + address.getCity();
    }
}
