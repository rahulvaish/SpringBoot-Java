package com.example.SpringBootToggle.controller;

import com.example.SpringBootToggle.enums.AppFeatures;
import com.example.SpringBootToggle.model.Product;
import com.example.SpringBootToggle.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.LazyResolvingFeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    FeatureManager manager;

    @Autowired
    AppService appService;

    @GetMapping("/orders")
    public List<Product> showAvailableProducts() {
        if (manager.isActive(AppFeatures.DISCOUNT_APPLIED)){
            return appService.getDiscountedProducts();
        } else {
            return appService.getAllProducts();
        }
    }

}
