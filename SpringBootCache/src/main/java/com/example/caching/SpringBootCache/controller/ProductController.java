package com.example.caching.SpringBootCache.controller;

import com.example.caching.SpringBootCache.entity.Product;
import com.example.caching.SpringBootCache.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    @Cacheable(value = "cacheEmployees")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/clearCache")
    @CacheEvict(value = "cacheEmployees", allEntries = true)
    public void clearCacheEmployees()
    {

    }

}
