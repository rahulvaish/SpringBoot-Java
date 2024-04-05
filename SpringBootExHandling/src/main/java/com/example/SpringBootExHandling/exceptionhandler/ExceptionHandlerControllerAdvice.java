package com.example.SpringBootExHandling.exceptionhandler;

import com.example.SpringBootExHandling.exception.EmployeeServiceException;
import com.example.SpringBootExHandling.exception.ResourceNotFoundException;
import com.example.SpringBootExHandling.model.ExceptionResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody
	ExceptionResponse handleResourceNotFound(final ResourceNotFoundException exception,
											 final HttpServletRequest request) {
		ExceptionResponse ex = new ExceptionResponse();
		ex.setErrorMessage(exception.getMessage());
		ex.callerURL(request.getRequestURI());
		return ex;
	}

	@ExceptionHandler(EmployeeServiceException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleException(final EmployeeServiceException exception,
			final HttpServletRequest request) {
		ExceptionResponse ex = new ExceptionResponse();
		ex.setErrorMessage(exception.getMessage());
		ex.callerURL(request.getRequestURI());
		return ex;
	}

}