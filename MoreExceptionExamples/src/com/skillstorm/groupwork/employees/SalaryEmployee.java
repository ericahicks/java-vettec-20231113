package com.skillstorm.groupwork.employees;

import com.skillstorm.groupwork.exceptions.InvalidSalaryException;

public class SalaryEmployee extends Employee {
	// TODO 03 encapsulate Salary Employee
	double salary; // annual salary
	
	// TODO 05 override calculate pay
	@Override
	public double calculatePay() {
		return 0;
	}

	public double getSalary() {
		return salary;
	}

	// TODO 08a throw custom exception in the setter
	public void setSalary(double salary) throws InvalidSalaryException {
		this.salary = salary;
	}
	
}
