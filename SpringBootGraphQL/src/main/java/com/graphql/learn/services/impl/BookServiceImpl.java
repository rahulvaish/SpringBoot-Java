package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Book;
import com.graphql.learn.repositories.BookRepo;
import com.graphql.learn.services.BookService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }


    @PostConstruct
    public void init() {
        Book b1 = new Book();
        b1.setTitle("Complete Reference");
        b1.setDesc("For learning java");
        b1.setPages(2000);
        b1.setPrice(5000);
        b1.setAuthor("XYZ");

        Book b2 = new Book();
        b2.setTitle("Think Java");
        b2.setDesc("For learning java");
        b2.setPages(3000);
        b2.setPrice(5000);
        b2.setAuthor("ABC");

        Book b3 = new Book();
        b3.setTitle("Head first to java");
        b3.setDesc("For starting java concepts");
        b3.setPages(1000);
        b3.setPrice(2000);
        b3.setAuthor("PQR");

        create(b1);
        create(b2);
        create(b3);
    }
}
