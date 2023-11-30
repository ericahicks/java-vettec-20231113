package com.skillstorm.assignment;

import java.time.LocalDate;

public class PersonTests {
	
	public static void main(String[] args) {
		// Person must have dob
		Person person = new Person("George", LocalDate.of(2023, 11, 29));
		System.out.println(person); // DO NOT need to call person.toString() because sysout will do that automatically
		System.out.println(person.getAge());
		System.out.println(person.bestFriend); // I haven't set a friend yet so null
		Person person2 = new Person("Jo", LocalDate.of(2023, 11, 30));
		
		System.out.println(">>> Assigning a best freind to George");
		person.bestFriend = person2;
		person2.bestFriend = person;
		System.out.println("George's best friend: " + person.bestFriend);
		System.out.println("Jo's best friend: " + person2.bestFriend);
		
		System.out.println(">>> Assigning Jo to be his own best friend ");
		person2.bestFriend = person2;
		System.out.println("Jo's best friend is " + person2.bestFriend);
	}

}
