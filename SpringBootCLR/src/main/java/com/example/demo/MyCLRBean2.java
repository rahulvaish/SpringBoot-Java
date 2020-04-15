package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=1)
@Component
public class MyCLRBean2 implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Hello Bean2/Component2");
		
	}

}
