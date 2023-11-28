package com.skillstorm;

import java.util.Scanner;

public class BooleanToSwitchRefactor {

	/**
	 * Example converting Group Assignment if-else into switch statements since
	 * we are matching exact values NOT ranges of values.
	 * 
	 * Group Assignment:
	 * Use of if with return statements instead of if-else inspired by Team Spring
	 * https://stormsurge.skillstorm.com/courses/3835/assignments/33592
	 * 
	 * @author Erica Hicks
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the program for deciding if you");
		System.out.println("Should Play Tennis Today?\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's look at the weather conditions.\n");

		if (isWeatherGood(scanner)) {
			System.out.println("\nYes! Today is a great day to play tennis.");
		} else {
			System.out.println("Stay home and drink some tea");
		}

		scanner.close();
	}

	public static boolean isWeatherGood(Scanner scanner) {
		// Prompt for weather conditions
		String outlook = checkOutlook(scanner);
		
		switch (outlook) {
			case "sunny":
				String humidity = checkHumidity(scanner);
				switch (humidity) {
				case "low":
					return true;
				case "high": // fallthrough
			    default:
			    	return false;
				}
			case "overcast":
				return true;
			case "rainy":
				String wind = checkWind(scanner);
				switch (wind) {
				case "weak":
					return true;
				case "strong": // fallthrough
				default:
					return false;
				}
			default: // play it safe and return false
				return false;
		}
		
	}

	// Note: Separation of concerns dictates each method should have one purpose only
	//   So here the task of prompting the user is in a separate method from the boolean
	//   utility function itself
	private static String checkWind(Scanner scanner) {
		System.out.println("Okay, sounds like it is a rainy day.");
		System.out.println("Is the wind strong or weak?");
		String wind = scanner.nextLine();
		return wind;
	}

	private static String checkOutlook(Scanner scanner) {
		System.out.println("Is the outlook sunny, overcast, or rainy? ");
		String outlook = scanner.nextLine();
		return outlook;
	}

	private static String checkHumidity(Scanner scanner) {
		System.out.println("Okay, sounds like it is a sunny day.");
		System.out.println("Is the humidity low or high? ");
		String humidity = scanner.nextLine();
		return humidity;
	}

}
