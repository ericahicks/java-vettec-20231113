package com.skillstorm;

/*
 * Re-throwing an exception allows us to change the exception to something more specific
 * Use the constructor with the Exception(Throwable cause) to include the previous excpetion type
 */
public class RethrowExample {
	
	// Write a program that has a person eat an apple but it is rotten, throw custom exception

}

class Person {
	void eat(Food food) throws RottenFoodException {
		
	}
}

class Food {
	
}

class Apple extends Food {
	
}

class Mango extends Food {
	
}

class RottenFoodException {
	
}
