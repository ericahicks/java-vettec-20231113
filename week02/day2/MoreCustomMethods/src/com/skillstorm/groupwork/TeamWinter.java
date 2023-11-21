package com.skillstorm.groupwork;

import java.util.Scanner;

/**
 * Code from the group assignment
 * https://stormsurge.skillstorm.com/courses/3835/assignments/33592
 * 
 * @author Rod, Steven, Matt
 */
public class TeamWinter {

	public static void main(String[] args) {
		System.out.println("Welcome to the program for deciding if you");
		System.out.println("Should Play Tennis Today\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's look at the weather conditions.\n");

		if (isWeatherGood(scanner)) {
			System.out.println("Yes! Today is a great day to play tennis.");
		} else {
			System.out.println("No, today is not good tennis weather. Maybe go bowling.");
		}

		scanner.close();

	}
	
	public static boolean isWeatherGood(Scanner scanner) {
		//response = false if bad weather and true if good weather
		String response = "null";
		System.out.print("Is it sunny? (yes or no)");
		response = scanner.nextLine();
		if (!response.equalsIgnoreCase("yes")) {
			System.out.print("Is it overcast? (yes or no)");
			response = scanner.nextLine();
			if (!response.equalsIgnoreCase("yes")) {
				System.out.print("Is there a strong wind? (yes or no)");
				response = scanner.nextLine();
				return (!response.equalsIgnoreCase("yes"));
			} else return true;	// overcast						
			//end if
		} else {
			System.out.print("Is it humid? (yes or no) ");
			response = scanner.nextLine();
			return (!response.equalsIgnoreCase("no"));
		} 												
		//end if
	}

}
