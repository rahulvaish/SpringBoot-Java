package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }

}
