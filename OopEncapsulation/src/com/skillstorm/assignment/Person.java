package com.skillstorm.assignment;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	
	private String name;
	// this is a constant, so mark it as final and use capslock
	private final LocalDate DOB; // must be initialized here or in constructor and cannot be changed
	
	private Person bestFriend;
	
	public Person() { 
		this.DOB = LocalDate.now();
	}
	
	public Person(String name, LocalDate dOB, Person bestFriend) {
		this.name = name;
		DOB = dOB;
		this.bestFriend = bestFriend;
	}
	
	// copy constructor
	public Person(Person person) {
			this.name = person.name;
			this.DOB = person.DOB;
			this.bestFriend = person.bestFriend;
	}

	public Person getBestFriend() {
		if (this.bestFriend == null)
			return null;
		// Do I want to be able to see later if the friend changes their name
		// or do I want a snapshot in time (a copy) of the friend
//		return new Person(this.bestFriend.name, this.bestFriend.DOB, this.bestFriend.bestFriend);
		return bestFriend;
	}
	
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
