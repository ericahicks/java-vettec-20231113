package com.skillstorm.groupwork.exceptions;

// TODO 06b Add constructors
public class InvalidWageException extends InvalidPayException {
	
	public InvalidWageException() {
		super();
	}
	
	public InvalidWageException(String message) {
		super(message);
	}
	
	public InvalidWageException(String message, Throwable cause) {
		super(message, cause);
	}
}
