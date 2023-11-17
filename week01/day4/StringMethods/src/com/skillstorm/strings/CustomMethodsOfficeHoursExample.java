package com.skillstorm.strings;

import java.util.Scanner;

public class CustomMethodsOfficeHoursExample {
	
	
	
	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the interst calculator!");
		System.out.format("%s%,.2f.", "hello", 2.0);
		
		System.out.println("Press 1 for simple interest, Press 2 for compound interest ");
		int choice = scanner.nextInt();
		scanner.nextLine(); // clear the rest of the line from the scanner input
		
		if (choice == 1) {
			calculateSimpleInterest();
		} else {
			calculateCompundInterest();
		}
		
		scanner.close();
	}

	public static void calculateSimpleInterest() {
	}
	
	public static void calculateCompundInterest() {
		
	}

}
