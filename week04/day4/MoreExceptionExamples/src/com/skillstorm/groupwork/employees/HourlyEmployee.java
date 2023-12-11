package com.skillstorm.groupwork.employees;

import com.skillstorm.groupwork.exceptions.InvalidWageException;

public class HourlyEmployee extends Employee {
	// TODO 02 encapsulate HourlyEmployee 
	private double hoursWorked;
	private double wage; // per hour
	
	// TODO 04 override calculatePay
	@Override
	public double calculatePay() {
		return hoursWorked * wage * (1 - getTaxRate());
	}

	public double getHoursWorked() {
		return hoursWorked;
	}
	
	private double getTaxRate() {
		return 0.2;
	}
	
	// TODO 07a throw IllegalArgumentException
	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked < 0) {
			throw new IllegalArgumentException("Hours worked may not be negative");
		}
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	// TODO 07b throw custom exception in the setter
	// Federal minimum wage is $7.25
	public void setWage(double wage) throws InvalidWageException {
		if (this.wage < MINIMUM_WAGE)
			throw new IllegalArgumentException("Wage cannot be less than minimum wage.");
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "HourlyEmployee:\n  hoursWorked=" 
					+ hoursWorked + "\n  wage=" 
					+ wage + "\n  getId()=" 
					+ getId() + "\n  getName()="
					+ getName() + "\n  getManager()=" 
					+ getManager();
	}
	
	
}
