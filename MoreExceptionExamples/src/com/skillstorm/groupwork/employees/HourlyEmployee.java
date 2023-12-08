package com.skillstorm.groupwork.employees;

import com.skillstorm.groupwork.exceptions.InvalidWageException;

public class HourlyEmployee extends Employee {
	// TODO 02 encapsulate HourlyEmployee 
	double hoursWorked;
	double wage; // per hour
	
	// TODO 04 override calculatePay
	@Override
	public double calculatePay() {
		return 0;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}
	
	// TODO 07a throw IllegalArgumentException
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	// TODO 07b throw custom exception in the setter
	// Federal minimum wage is $7.25
	public void setWage(double wage) throws InvalidWageException {
		this.wage = wage;
	}
	
	
}
