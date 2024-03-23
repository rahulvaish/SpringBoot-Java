package com.example.SpringBootActuator.check;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheckUtils implements HealthIndicator {

    public static final String A = "SERVICE A";
    public static final String B = "SERVICE B";

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        Health.Builder healthBuilder = Health.up();
        if (isHealthOfAGreen()) {
            healthBuilder.withDetail("A", "A is Green");
        } else {
            healthBuilder.down().withDetail("A", "A is RED");
        }

        if (isHealthOfBGreen()) {
            healthBuilder.withDetail("B", "B is Green");
        } else {
            healthBuilder.down().withDetail("B", "B is RED");
        }

        return healthBuilder.build();
    }

    private Boolean isHealthOfAGreen(){
        return true;
    }
    private Boolean isHealthOfBGreen(){
        return false;
    }
}
