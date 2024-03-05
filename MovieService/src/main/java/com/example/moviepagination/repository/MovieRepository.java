package com.example.moviepagination.repository;

import com.example.moviepagination.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface MovieRepository extends MongoRepository<Movie, Long> {

    /* @Query(value = "{}", fields = "{ 'title' : 1 }")
       Page<String> findAllTitle(Pageable pageable); */

    default Page<String> findAllTitle(Pageable pageable) {
        Page<Movie> moviePage = findAll(pageable);
        return moviePage.map(Movie::getTitle);
    }
}
