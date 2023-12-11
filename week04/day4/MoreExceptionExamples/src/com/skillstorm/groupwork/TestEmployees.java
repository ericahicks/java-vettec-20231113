package com.skillstorm.groupwork;

import com.skillstorm.groupwork.employees.Employee;
import com.skillstorm.groupwork.employees.HourlyEmployee;
import com.skillstorm.groupwork.employees.SalaryEmployee;
import com.skillstorm.groupwork.exceptions.InvalidSalaryException;

public class TestEmployees {
	
	public static void main(String[] args) {
		// TODO 09a Test the SalaryEmployee calculatePay 
		Employee employee = null;
		try {
			employee = new SalaryEmployee("Curious George", 27000);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(employee);		;
		
		// TODO 09b Test the SalaryEmployee setter
		
		// TODO 10a Test the HourlyEmployee calculatePay
		Employee employee2 = new HourlyEmployee();
		
		// TODO 10b Test the HourlyEmployee setters
	}

}
