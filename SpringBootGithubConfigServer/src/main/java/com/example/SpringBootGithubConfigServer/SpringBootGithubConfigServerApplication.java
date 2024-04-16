package com.example.SpringBootGithubConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootGithubConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubConfigServerApplication.class, args);
	}

}

