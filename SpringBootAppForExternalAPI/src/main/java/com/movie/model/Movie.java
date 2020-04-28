package com.movie.model;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	String title;
	String overview;

	public Movie() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", overview=" + overview + "]";
	}

	
	
}
