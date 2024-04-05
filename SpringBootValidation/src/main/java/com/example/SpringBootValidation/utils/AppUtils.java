package com.example.SpringBootValidation.utils;

import com.example.SpringBootValidation.model.CustomerTwo;

import java.util.ArrayList;
import java.util.List;

public class AppUtils {
    public static List<String> verifyValidation(CustomerTwo customerTwo) {
        List<String> errorMessages = new ArrayList<>();
        if(customerTwo.getCustomerName().length() > 5) {
            errorMessages.add("NAME VALID FAILED");
        }
        if(customerTwo.getCustomerCountry().length() > 5) {
            errorMessages.add("COUNTRY VALID FAILED");
        }
        return errorMessages;
    }
}
