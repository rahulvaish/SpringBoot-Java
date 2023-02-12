package com.example.redis.mysql.redismysqlexample.controller;

import com.example.redis.mysql.redismysqlexample.entity.Product;
import com.example.redis.mysql.redismysqlexample.repository.ProductRepository;
import com.example.redis.mysql.redismysqlexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final String HASH = "ProductHASH";

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/getProduct/{id}")
    @Cacheable(key = "#id",value = HASH)
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/updateProduct")
    @CachePut(key = "#product",value = HASH)
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    @CacheEvict(key = "#id",value = HASH)
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
