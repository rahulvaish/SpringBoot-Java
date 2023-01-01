package com.example.SpringBootDocker;

import org.springframework.web.bind.annotation.*;


@RestController
public class SpringBootDockerController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}

	@GetMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}