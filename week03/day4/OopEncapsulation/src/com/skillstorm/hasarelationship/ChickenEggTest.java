package com.skillstorm.hasarelationship;

public class ChickenEggTest {
	
	public static void main(String[] args) {
		// TODO 1 Which came first?
		// The chicken or the egg?
		Egg egg = new Egg();
		egg.weight = 10;
		Chicken chick = new Chicken();
		chick.color = "yellow";
		
		// circular reference
		chick.egg = egg;
		egg.chicken = chick;
		
		System.out.println(egg); // Exception in thread "main" java.lang.StackOverflowError
		System.out.println(chick);
	}

}
