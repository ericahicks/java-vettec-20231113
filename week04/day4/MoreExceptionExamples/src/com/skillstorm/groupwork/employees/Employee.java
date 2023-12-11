package com.skillstorm.groupwork.employees;

import com.skillstorm.groupwork.exceptions.InvalidPayException;

public abstract class Employee {
	
	public static long employeeIds;

	// TODO 01 encapsulate Employee
	private final long id;
	private String name = "Name";
	private Employee manager = null;
	public static final double MINIMUM_WAGE = 7.25;
	
	public Employee() {
		this.id = employeeIds++;
	}
	
	public Employee(String name, Employee manager) {
		this();
		this.name = name;
		this.manager = manager;
	}

	public Employee(String name) {
		this(name, null);
	}

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}
	

	/*
	 * Calculates the pay for the current period.
	 */
	public abstract double calculatePay() throws InvalidPayException;
	
	public String toString() {
		return String.format("Employee %d: %s (Manager - %s)", id, name, 
								manager == null ? "none" : manager.name);
	}
	
	

}
