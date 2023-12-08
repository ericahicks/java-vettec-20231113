package com.skillstorm;

import java.io.IOException;

/*
 * Re-throwing an exception allows us to change the exception to something more specific
 * Use the constructor with the Exception(Throwable cause) to include the previous excpetion type
 */
public class RethrowExample {

	// Write a program that has a person eat an apple but if it is rotten, throw
	// custom exception
	public static void main(String[] args) {
		// Create a person
		Person person = new FrugalPerson();
		// Create an apple
		Food food = new Mango();
		food.setName("rainbow mango");
		food.setRotten(true);
		// Eat the apple
		try {
			person.eat(food);
		} catch (RottenFoodException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Have a nice day.");
	}
}

class Person {
	/* default aka package private */ void eat(Food food) throws RottenFoodException {
		// Check if it is rotten
		if (food.isRotten()) { // == true) { // redundant
			throw new RottenFoodException("The " + food.getName() + " is rotten.");
//			return; // throw ends the method so you do not need and cannot have a return statement
		}
		System.out.println("Eating the " + food);
		return;
	}
}

class FrugalPerson extends Person {
	// Don't throw away rotten food, salvage it
	@Override
	public void eat(Food food) throws RottenFoodException /* fewer or more specific exceptions */ { // What is different about this method declaration from the parents?
		if (food.isRotten()) {
			System.out.println("Eating the " + food.getName() + ", but it is rotten.\n" 
						+ " Try cutting off the rotten bit.");
		} else {
			System.out.println("Eating the " + food);
		}
	}
	
	// Rethrow an exception to make it more specific
	public void eat(Mango fruit) throws RottenMangoException {
		// call the parents eat(food) then rethrow a different excpetion
		try {
			super.eat(fruit);
		} catch (RottenFoodException e) {
			throw new RottenMangoException(e.getMessage(), e);
		}
	}
	
	
}

class Food {
	private boolean isRotten;
	private String name;

	public boolean isRotten() { // for boolean getters, you can call it isName instead of getName
		return isRotten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRotten(boolean isRotten) {
		this.isRotten = isRotten;
	}

	public String toString() {
		if (isRotten) {
			return "The " + name + " should not be eaten.";
		} else {
			return "The " + name + " is good to eat.";
		}
	}
}

class Apple extends Food {

}

class Mango extends Food {

}

// Side note: to get the warning to go away include a serial_id number so
class RottenFoodException extends Exception {

	public RottenFoodException() {
	}

	// Right now I only have the default
	// because constructors are not inherited
	public RottenFoodException(String message) {
		// super is called automatically, right? Can't I omit the super(message)? NOPE
		// SORRY
		// super(); // only the no-arg constructor is called automatically
		super(message);
	}
	
	public RottenFoodException(String message, Throwable cause) {
		super(message, cause);
	}

}

class RottenMangoException extends RottenFoodException {
	public RottenMangoException(String message, Throwable cause) {
		super(message, cause);
	}
}
