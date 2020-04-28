package com.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.movie.model.Movie;

import reactor.core.publisher.Mono;

@Service
public class MovieService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientbuilder;

	@Autowired
	private Movie movie;

	public Movie getmovie(String movieId) {
		Movie output = restTemplate.getForObject(
				"https://api.themoviedb.org/3/movie/"+movieId+"?api_key=471bc57ae934c8533612bbb4c9d41728", Movie.class);
		return output;
	}

}