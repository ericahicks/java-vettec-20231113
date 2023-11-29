package com.skillstorm;

public class Person {

	static long population = 0;
	
	String name;
	int age = 0;
	String food;
	String sport;
	
	public /* Person */ Person(String name) {
		this.name = name;
		this.sport = "Soccer";
		this.age = 60;
		Person.population++;
//		population++; // alternative to access the static property omit the class name
		// no return statement but it is returning an object of type Person with properties
	}

}
