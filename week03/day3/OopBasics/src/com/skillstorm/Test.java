package com.skillstorm;

public class Test {
	
	public static void main(String[] args) {
		Person person = new Person("Mark"); // It can't be more than three
		Person person2 = new Person("John"); // It can't be more than three
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.sport);
		System.out.println(person.food);
		person.food = "cookies";
		System.out.println(">>> changing food to cookies");
		System.out.println(person.food);
		System.out.println(Person.population); // MANDATORY to put the name of the class. Why??? I am not inside the Person class so it won't know what I mean and where to look

	}

}
