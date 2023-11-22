package com.skillstorm;

import java.util.Arrays;

// Use Arrays.equals(_,_) NOT == with arrays
public class ComparingArrays {
	
	public static void main(String[] args) {
		String[] animals = {"spider", "cat", "dog"};
		String[] pets = {"spider", "cat", "dog"};
		System.out.println("Is the animals array the same as the pets: " + (animals == pets));
		
		System.out.println("Is the animals array equal to the pets: " + Arrays.equals(animals, pets));
	}

}
