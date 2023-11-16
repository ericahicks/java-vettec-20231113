package com.skillstorm.strings;

public class StringFormatExamples {
	
	public static void main(String[] args) {
		// I'm at the grocery store and they have cookies on sale 1.99 for 5
		// To look at the cost of one cookie
		// I want to see the price 
		// but format it nicely
		double costForOneOfFiveCookies = 1.99 / 5;
		String formattedString = String.format("One cookie costs $%10.2f topay!", costForOneOfFiveCookies);
		System.out.println(formattedString);
		
		/*
		 * The formatters to know:
		 * %f for floating point (double and float types)
		 * %s for strings 
		 * %d for whole numbers (int, long, short, byte)
		 * 
		 * To format it further
		 * %10f means a width of 10
		 * %.2f means 2 digits after the decimal
		 * 
		 */
		
		System.out.format("%10s\n", "Students");
		System.out.println("-------------");
		String name = "Rod";
		System.out.format("%10s%n", name);
		name = "Josh";
		System.out.format("%10s%n", name);
		name = "Timothy";
		System.out.format("%10s%n", name);
	}
	

}
