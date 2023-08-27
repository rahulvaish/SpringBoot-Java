package com.example.caching.SpringBootCache.service;

import com.example.caching.SpringBootCache.entity.Product;
import com.example.caching.SpringBootCache.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }
}