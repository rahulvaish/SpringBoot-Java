package com.example.SpringBootAPIKey.util;

import com.example.SpringBootAPIKey.model.ApiKey;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class AppUtils {


    public static List<ApiKey> prepareAPIKeysWithServiceKeysList(){
        ApiKey apiKeyA = new ApiKey();
        apiKeyA.setKey("343C-ED0B-4137-B27E");
        List<String> serviceListA = new ArrayList<>();
        serviceListA.add(AppConstants.STUDENT_SERVICE_KEY);
        serviceListA.add(AppConstants.COURSE_SERVICE_KEY);
        apiKeyA.setServices(serviceListA);

        ApiKey apiKeyB = new ApiKey();
        apiKeyB.setKey("FA48-EF0C-427E-8CCF");
        List<String> serviceListB = new ArrayList<>();
        serviceListB.add(AppConstants.COURSE_SERVICE_KEY);
        apiKeyB.setServices(serviceListB);

        List<ApiKey> apiKeys = new ArrayList<>();
        apiKeys.add(apiKeyA);
        apiKeys.add(apiKeyB);

        return apiKeys;
    }

    public static LinkedHashMap<String,ApiKey> getAPIKeys(){
        ApiKey apiKeyA = new ApiKey();
        apiKeyA.setKey("343C-ED0B-4137-B27E");
        List<String> serviceListA = new ArrayList<>();
        serviceListA.add(AppConstants.STUDENT_SERVICE_KEY);
        serviceListA.add(AppConstants.COURSE_SERVICE_KEY);
        apiKeyA.setServices(serviceListA);

        ApiKey apiKeyB = new ApiKey();
        apiKeyB.setKey("FA48-EF0C-427E-8CCF");
        List<String> serviceListB = new ArrayList<>();
        serviceListB.add(AppConstants.COURSE_SERVICE_KEY);
        apiKeyB.setServices(serviceListB);


        LinkedHashMap<String,ApiKey> map = new LinkedHashMap<>();
        map.put("343C-ED0B-4137-B27E",apiKeyA);
        map.put("FA48-EF0C-427E-8CCF",apiKeyB);

        return map;
    }

}
