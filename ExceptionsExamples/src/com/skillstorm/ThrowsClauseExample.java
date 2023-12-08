package com.skillstorm;

public class ThrowsClauseExample {

	public static void main(String[] args) {
		try {
		sayHello("");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("still in main running code hurray!");
	}
	
	public static void sayHello(String name) throws Exception {
		if (name == null || name.isEmpty())
			throw new Exception("Please provide a name"); //checked exception
		System.out.println("Hello " + name);
	}
	
	public static void sayHelloTwice(String name) throws Exception {
		sayHello(name);
		sayHello(name);
	}

}
