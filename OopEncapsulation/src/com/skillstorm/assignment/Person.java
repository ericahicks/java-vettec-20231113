package com.skillstorm.assignment;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	
	String name;
	// this is a constant, so mark it as final and use capslock
	final LocalDate DOB; // must be initialized here or in constructor and cannot be changed
	
	public Person(String name, LocalDate dob) {
		this.name = name;
		this.DOB = dob;
	}
	
	public int getAge() {
		return (int) ChronoUnit.YEARS.between( 
			    this.DOB  , 
			    LocalDate.now() 
			);
	}
	
	// Instance methods can access instance data to manipulate or return it
	public String toString() {
		return this.name + " was born " + this.DOB;
	}
}
