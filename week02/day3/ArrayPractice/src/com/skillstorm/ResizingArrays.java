package com.skillstorm;

import java.util.Arrays;

public class ResizingArrays {
	
	public static void main(String[] args) {
		String[] students = { "Nick", "Josh", "Hunter"};
		System.out.println(Arrays.toString(students));
		
		// To access the length of an array, we can use .length
		int length = students.length;
		System.out.println("The length of the array is: " + length);
		
		students = Arrays.copyOf(students, 5);
		System.out.println(Arrays.toString(students));
		students[length] = "Tim";
		students[length + 1] = "Shawn";
		System.out.println(Arrays.toString(students));
		
		
		char[] grades = {'A', 'B', 'C'};
		System.out.println(Arrays.toString(grades));
		grades = Arrays.copyOf(grades, 5);
		System.out.println(Arrays.toString(grades));// what should this print?
		
		
		
		
	}

}
