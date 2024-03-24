package com.example.SpringBootLoadBalancer.config;

import com.example.SpringBootLoadBalancer.supplier.AppSupplier;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
class AppConfig {
    @Bean
    ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new AppSupplier("example-service");
    }
}