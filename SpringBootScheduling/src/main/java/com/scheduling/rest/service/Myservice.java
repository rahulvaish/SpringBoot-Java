package com.scheduling.rest.service;

import java.util.Calendar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Myservice {
	@Scheduled(initialDelay = 100, fixedRate = 1000)
	//@Scheduled(cron = "0 10 10 10 * ?")
    public void run() {
    	System.out.println("Current time is :: " + Calendar.getInstance().getTime());
    }
}
