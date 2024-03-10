package com.example.SpringBootRetryable;

import com.example.SpringBootRetryable.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class SpringBootRetryableApplication{

	@Autowired
	private AppService appService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRetryableApplication.class, args);
	}

}
