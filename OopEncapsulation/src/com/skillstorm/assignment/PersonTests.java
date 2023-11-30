package com.skillstorm.assignment;

import java.time.LocalDate;

public class PersonTests {
	
	public static void main(String[] args) {
		// Person must have dob
		Person person = new Person("George", LocalDate.of(2023, 11, 29));
		System.out.println(person); // DO NOT need to call person.toString() because sysout will do that automatically
		System.out.println(person.getAge());
	}

}
