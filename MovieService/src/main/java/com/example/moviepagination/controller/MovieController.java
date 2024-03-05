package com.example.moviepagination.controller;

import com.example.moviepagination.entity.Movie;
import com.example.moviepagination.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }


    @GetMapping("/getAllMovies")
    public Page<Movie> getAllMovies(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size){
        return movieService.getAllMovies(page, size);
    }

    @GetMapping("/getAllMovieTitles")
    public Page<String> getAllMovieTitles(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size){
        return movieService.getAllMovieTitles(page, size);
    }
}
