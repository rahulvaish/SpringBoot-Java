package com.example.SpringBootInterceptor.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterceptorConfig {

    @Bean
    public AppInterceptor appInterceptor() {
        return new AppInterceptor();
    }
}
