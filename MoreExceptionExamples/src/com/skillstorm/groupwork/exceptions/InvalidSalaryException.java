package com.skillstorm.groupwork.exceptions;

// TODO 06c Add constructors
public class InvalidSalaryException extends InvalidPayException {
	
	public InvalidSalaryException() {
		super();
	}
	
	public InvalidSalaryException(String message) {
		super(message);
	}
	
	public InvalidSalaryException(String message, Throwable cause) {
		super(message, cause);
	}
}
