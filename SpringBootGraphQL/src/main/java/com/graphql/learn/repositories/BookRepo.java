package com.graphql.learn.repositories;

import com.graphql.learn.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
