package com.example.SpringBootLoadBalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootLoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoadBalancerApplication.class, args);
	}
}
