package com.example.SpringBootExHandling.exception;

public class EmployeeServiceException extends Exception {

	public EmployeeServiceException() {
		super();
	}

	public EmployeeServiceException(final String message) {
		super(message);
	}
}