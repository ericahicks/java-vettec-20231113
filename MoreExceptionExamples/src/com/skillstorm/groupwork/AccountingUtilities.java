package com.skillstorm.groupwork;

import com.skillstorm.groupwork.employees.Employee;
import com.skillstorm.groupwork.exceptions.InvalidPayException;

public class AccountingUtilities {
	
	double budget;
	
	// TODO 11 If time, calculateTotalPay
	public double calculateTotalPay(Employee[] employees) {
		double sum = 0;
		for (Employee employee : employees) {
			try {
				sum += employee.calculatePay() * 1.2;
			} catch (InvalidPayException e) {
				throw new BudgetExceededException("Employee pay exceeds budget. You are in the red.");
			}
		}
		return sum;
	}

}
