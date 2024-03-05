package com.example.SpringBootToggle.service;

import com.example.SpringBootToggle.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AppService {

    public List<Product> getAllProducts() {
        return Stream.of(new Product(1, "mobile", 50000),
                new Product(2, "headphone", 2000),
                new Product(3, "watch", 14999)
                , new Product(4, "glass", 999)
        ).collect(Collectors.toList());
    }

    public List<Product> getDiscountedProducts() {
        List<Product> discountedProducts = getAllProducts().stream().map(product -> {
                    product.setPrice(product.getPrice() * 0.75); // Applying 25% discount
                    return product;
                })
                .collect(Collectors.toList());
        return discountedProducts;
    }

}
