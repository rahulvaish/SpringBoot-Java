package com.spring.beanxmlconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringBeanXmlConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanXmlConfigApplication.class, args);
	}

}
