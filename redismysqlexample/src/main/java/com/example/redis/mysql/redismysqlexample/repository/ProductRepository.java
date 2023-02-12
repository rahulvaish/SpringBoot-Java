package com.example.redis.mysql.redismysqlexample.repository;

import com.example.redis.mysql.redismysqlexample.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
