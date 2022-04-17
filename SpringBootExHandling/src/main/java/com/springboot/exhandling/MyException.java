package com.springboot.exhandling;

public class MyException extends Exception {


	public MyException() {
		super();
	}

	public MyException(final String message) {
		super(message);
	}
}