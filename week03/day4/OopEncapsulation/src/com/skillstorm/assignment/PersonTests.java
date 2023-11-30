package com.skillstorm.assignment;

import java.time.LocalDate;

public class PersonTests {
	
	public static void main(String[] args) {
		// Person must have dob
		Person person = new Person("George", LocalDate.of(2023, 11, 29));
		System.out.println(person); // DO NOT need to call person.toString() because sysout will do that automatically
		System.out.println(person.getAge());
		System.out.println(person.getBestFriend()); // I haven't set a friend yet so null
		Person person2 = new Person("Jo", LocalDate.of(2023, 11, 30));
		
		System.out.println(">>> Assigning a best freind to George");
		person.setBestFriend(person2);
		person2.setBestFriend(person);
		System.out.println("George's best friend: " + person.getBestFriend());
		System.out.println("Jo's best friend: " + person2.getBestFriend());
		
		System.out.println(">>> Assigning Jo to be his own best friend ");
		person2.setBestFriend(person2);
		System.out.println("Jo's best friend is " + person2.getBestFriend());
	}

}
