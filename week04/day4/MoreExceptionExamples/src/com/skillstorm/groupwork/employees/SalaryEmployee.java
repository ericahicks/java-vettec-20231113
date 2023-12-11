package com.skillstorm.groupwork.employees;

import com.skillstorm.groupwork.exceptions.InvalidSalaryException;

public class SalaryEmployee extends Employee {
	// TODO 03 encapsulate Salary Employee
	private double salary; // annual salary
	
	public SalaryEmployee() {
		super();
	}
	
	public SalaryEmployee(String name, Employee manager) {
		super(name, manager);
	}
	
	public SalaryEmployee(String name, Employee manager, double salary) throws InvalidSalaryException {
		super(name, manager);
		this.setSalary(salary);
	}
	
	public SalaryEmployee(String name, double salary) throws InvalidSalaryException {
		this(name, null, salary);
	}
	
	// TODO 05 override calculate pay for bi-weekly paycheck
	@Override
	public double calculatePay() {
		return calculateWeeklySalary() * 2;
	}
	
	private double calculateWeeklySalary() {
		return this.salary / 52;
	}
	
	private double calculateAfterTaxes() {
		return calculateWeeklySalary() * .20;
	}

	public double getSalary() {
		return salary;
	}

	// TODO 08a throw custom exception in the setter
	public void setSalary(double salary) throws InvalidSalaryException {
		double minSalary = getMinSalary();
		if (salary < minSalary) {
			throw new InvalidSalaryException("Salary cannot be less than " + minSalary);
		}
		this.salary = salary;
	}
	
	public double getMinSalary() {
		return MINIMUM_WAGE * 40 * 52;
	}

	@Override
	public String toString() {
		return "SalaryEmployee: \n  salary=" 
					+ salary + "\n  getId()=" + getId() + "\n  getName()=" + getName()
				+ ",\n  getManager()=" + getManager();
	}
	
	
	
}
