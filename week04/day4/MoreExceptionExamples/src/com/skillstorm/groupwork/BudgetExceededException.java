package com.skillstorm.groupwork;

public class BudgetExceededException extends RuntimeException {
	public BudgetExceededException() {
		
	}
	
	public BudgetExceededException(String message) {
		super(message);
	}
	
	public BudgetExceededException(String message, Throwable cause) {
		super(message, cause);
	}
}
