package com.skillstorm.groupwork;

public class HourlyEmployee extends Employee {
	// TODO 2 encapsulate and throw exception in the setter
	double hoursWorked;
	double wage; // per hour
	
	// TODO 3 override calculatePay
	@Override
	public double calculatePay() {
		return 0;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	// Throw custom exception that checks valid wage
	// Federal minimum wage is $7.25
	public void setWage(double wage) throws InvalidWageException {
		this.wage = wage;
	}
	
	
}
