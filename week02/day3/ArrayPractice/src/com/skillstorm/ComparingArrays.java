package com.skillstorm;

import java.util.Arrays;
// This example was not covered in lecture so you will not be responsible for knowing == vs Arrays.equals on the exam Wed 11/29
// Use Arrays.equals(_,_) NOT == with arrays
public class ComparingArrays {
	
	public static void main(String[] args) {
		String[] animals = {"spider", "cat", "dog"};
		String[] pets = {"spider", "cat", "dog"};
		System.out.println("Is the animals array the same as the pets: " + (animals == pets));
		
		System.out.println("Is the animals array equal to the pets: " + Arrays.equals(animals, pets));
	}

}
