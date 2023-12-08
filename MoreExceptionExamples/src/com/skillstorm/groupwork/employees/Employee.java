package com.skillstorm.groupwork.employees;

import com.skillstorm.groupwork.exceptions.InvalidPayException;

public abstract class Employee {
	
	// TODO 01 encapsulate Employee
	long id = 1;
	String name = "Name";
	Employee manager = null;
	
	
	/*
	 * Calculates the pay for the current period.
	 */
	abstract double calculatePay() throws InvalidPayException;
	

}
