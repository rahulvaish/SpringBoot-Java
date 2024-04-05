package com.example.SpringBootExHandling.exception;

public class ResourceNotFoundException extends Exception {

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(final String message) {
		super(message);
	}
}