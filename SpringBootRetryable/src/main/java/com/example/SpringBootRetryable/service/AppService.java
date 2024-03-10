package com.example.SpringBootRetryable.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${retry.maxAttempts}")
    private int maxAttempts;

    private int counter=0;

    @Retryable(retryFor = {RuntimeException.class}, maxAttemptsExpression = "#{${retry.maxAttempts}}", backoff = @Backoff(delay = 1000))
    public void retryableMethod() {
        System.out.println("TRY" + counter);
        if (Math.random() < 0.5) {
            counter++;
            throw new RuntimeException("Failed to execute the method");
        } else {
            counter=0;
            System.out.println("Method executed successfully");
        }
    }
}