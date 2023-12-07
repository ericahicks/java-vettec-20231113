package com.skillstorm.groupwork;

public abstract class Employee {
	
	// TODO 1 encapsulate
	long id = 1;
	String name = "Name";
	Employee manager = null;
	
	
	/*
	 * Calculates the pay for the current period.
	 */
	abstract double calculatePay() throws InvalidPayException;
	

}
