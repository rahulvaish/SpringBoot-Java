package com.example.redis.mysql.redismysqlexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedismysqlexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedismysqlexampleApplication.class, args);
	}

}
