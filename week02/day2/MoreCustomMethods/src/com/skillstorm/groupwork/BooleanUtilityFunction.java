package com.skillstorm.groupwork;

import java.util.Scanner;

/**
 * Example solution for Group Assignment
 * 
 * Use of if with return statements instead of if-else inspired by Team Spring
 * https://stormsurge.skillstorm.com/courses/3835/assignments/33592
 * 
 * @author Erica Hicks
 */
public class BooleanUtilityFunction {
	public static void main(String[] args) {
		System.out.println("Welcome to the program for deciding if you");
		System.out.println("Should Play Tennis Today?\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's look at the weather conditions.\n");

		if (isWeatherGood(scanner)) {
			System.out.println("\nYes! Today is a great day to play tennis.");
		} else {
			System.out.println("\nNo, today is not good tennis weather. Maybe go bowling.");
		}

		scanner.close();
	}

	public static boolean isWeatherGood(Scanner scanner) {
		// Prompt for weather conditions
		System.out.println("Is the outlook sunny, overcast, or rainy? ");
		String outlook = scanner.nextLine();

		if (outlook.toLowerCase().contains("sun")) {
			System.out.println("Okay, sounds like it is a sunny day.");
			System.out.println("Is the humidity low or high? ");

			String humidity = scanner.nextLine();
			return humidity.equalsIgnoreCase("low"); // TRUE if low FALSE if high
													 // YES if low NO if high

		}
		if (outlook.toLowerCase().contains("rain")) {
			System.out.println("Okay, sounds like it is a rainy day.");
			System.out.println("Is the wind strong or weak?");

			String wind = scanner.nextLine();
			return wind.equalsIgnoreCase("weak"); // TRUE if weak FALSE if strong
													// YES if weak NO if strong

		}
		if (outlook.equalsIgnoreCase("overcast")) {

			return true; // YES play tennis

		}
		System.out.println("I do not understand. Let's play it safe.");
		return false;

	}
}
