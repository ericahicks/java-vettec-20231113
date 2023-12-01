package com.skillstorm;

public class Person {

	static long population = 0;
	
	String name;
	int age = 0;
	String food;
	String sport;
	
	public /* Person */ Person(String name) {
		super();
//		this(); // can't call this
		this.name = name; // I can use the this keyword still
		this.sport = "Soccer";
		this.age = 60;
		Person.population++;
//		population++; // alternative to access the static property omit the class name
		// no return statement but it is returning an object of type Person with properties
	}
	
	public Person() {
//		super();
		this("JOhn Doe"); // I can't call super if I call this
	}

}
