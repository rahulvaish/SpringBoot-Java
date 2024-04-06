package com.example.SpringBootTimeout.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;

@Component
public class TimeoutInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String endpointPath = request.getRequestURI();

        // Set different timeouts for specific endpoints
        int timeout;
        if ("/getDataOne".equals(endpointPath)) {
            timeout = 5000; // Timeout for endpoint1 (5 seconds)
        } else if ("/getDataTwo".equals(endpointPath)) {
            timeout = 11000; // Timeout for endpoint2 (10 seconds)
        } else {
            // Default timeout for other endpoints
            timeout = 0; // No timeout (or use a default timeout value)
        }

        // Set the timeout value as a request attribute
        request.setAttribute("timeout", timeout);

        // Start a new thread to monitor the timeout
        Thread timeoutThread = new Thread(() -> {
            try {
                Thread.sleep(timeout); // Sleep for the specified timeout
                if (!response.isCommitted()) { // Check if response is not already committed
                    response.setStatus(HttpServletResponse.SC_REQUEST_TIMEOUT);
                    response.getWriter().flush();
                    response.getWriter().close();
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        });
        timeoutThread.start(); // Start the timeout thread

        // Return true to continue processing the request
        return true;
    }
}
