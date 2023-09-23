package com.spring.beanxmlconfig.config;

import com.spring.beanxmlconfig.model.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Address getAddress() {
        return new Address();
    }
}