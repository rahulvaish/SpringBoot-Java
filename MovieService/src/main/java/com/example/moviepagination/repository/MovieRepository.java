package com.example.moviepagination.repository;

import com.example.moviepagination.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface MovieRepository extends MongoRepository<Movie, Long> {

}
