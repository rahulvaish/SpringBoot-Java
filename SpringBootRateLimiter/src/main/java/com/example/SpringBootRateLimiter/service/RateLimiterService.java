package com.example.SpringBootRateLimiter.service;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Service;

@Service
public class RateLimiterService {

    private final RateLimiter rateLimiter;

    public RateLimiterService() {
        //Create a RateLimiter with a rate of 2 request per 5 second
        double rate = 2.0 / 5.0;
        this.rateLimiter = RateLimiter.create(rate);
    }

    public boolean tryAcquire() {
        return rateLimiter.tryAcquire();
    }
}