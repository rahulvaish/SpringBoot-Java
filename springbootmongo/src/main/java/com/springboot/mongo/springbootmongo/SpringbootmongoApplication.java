package com.springboot.mongo.springbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@EnableMongoRepositories("com.springboot.mongo.springbootmongo.repository")
//@ComponentScan("com.springboot.*")

public class SpringbootmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmongoApplication.class, args);
	}

}
