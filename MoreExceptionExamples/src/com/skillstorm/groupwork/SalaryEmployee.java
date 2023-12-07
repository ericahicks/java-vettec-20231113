package com.skillstorm.groupwork;

public class SalaryEmployee extends Employee {
	// TODO 4 encapsulate (throw custom exception in setter guard clause)
	double salary; // annual salary
	
	// TODO 5 override calculate pay
	@Override
	public double calculatePay() {
		return 0;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		this.salary = salary;
	}
	
	
}
