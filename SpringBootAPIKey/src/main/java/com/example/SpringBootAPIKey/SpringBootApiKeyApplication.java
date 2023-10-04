package com.example.SpringBootAPIKey;

import com.example.SpringBootAPIKey.util.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApiKeyApplication {
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(AppConstants.COURSE_SERVICE_KEY,
						r -> r.path("/api/appOne/**")
								.filters(f -> f.stripPrefix(2)).uri("http://localhost:8090"))
				.route(AppConstants.STUDENT_SERVICE_KEY,
						r -> r.path("/api/appTwo/**")
								.filters(f -> f.stripPrefix(2)).uri("http://localhost:8091"))
				.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiKeyApplication.class, args);
	}

}
