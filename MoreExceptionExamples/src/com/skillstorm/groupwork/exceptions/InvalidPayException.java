package com.skillstorm.groupwork.exceptions;

// TODO 06a Add constructors
public class InvalidPayException extends Exception {
	
	public InvalidPayException() {
		super();
	}
	
	public InvalidPayException(String message) {
		super(message);
	}
	
	public InvalidPayException(String message, Throwable cause) {
		super(message, cause);
	}

}
