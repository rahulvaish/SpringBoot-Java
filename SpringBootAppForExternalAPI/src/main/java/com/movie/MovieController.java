package com.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Movie;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@Autowired
	Movie movie;
	
	@RequestMapping("/")
	public String welcome() {
		return "Movie Info Application";
	}
	
	@RequestMapping(value="/getmovie/{movieId}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public ResponseEntity getmovie(@PathVariable(value="movieId")String movieId) {		
		try{
			movie= movieService.getmovie(movieId);
			return ResponseEntity.status(HttpStatus.OK).body(movie);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
}
