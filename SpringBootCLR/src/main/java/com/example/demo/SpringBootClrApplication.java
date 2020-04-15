package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBootClrApplication {

	public static void main(String[] args) {
		/*ConfigurableApplicationContext contxt = SpringApplication.run(SpringBootClrApplication.class, args);
		MyService myservice = contxt.getBean(MyService.class);
		myservice.message();*/
		SpringApplication.run(SpringBootClrApplication.class, args);
	}

}
