package com.example.SpringBootPollScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootPollSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPollSchedulerApplication.class, args);
	}

}
