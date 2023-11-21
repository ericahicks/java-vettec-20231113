package com.skillstorm.groupwork;

import java.util.Scanner;

/**
 * Code from the group assignment
 * https://stormsurge.skillstorm.com/courses/3835/assignments/33592
 * 
 * @author Samuel, Tim, Hunter
 */
public class TeamFall {

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
		boolean isWeatherNice = false;

		System.out.print("What's the weather(sunny/rainy/overcast)? ");
		String weather = scanner.nextLine();

		if (weather.equalsIgnoreCase("sunny")) {
			System.out.println("Is the humidity high or normal? ");
			String responseString = scanner.nextLine();
			if (responseString.equalsIgnoreCase("normal")) {
				isWeatherNice = true;
			}
		} else if (weather.equalsIgnoreCase("rainy")) {
			System.out.println("Is the wind strong or weak? ");
			String responseString = scanner.nextLine();
			if (responseString.equalsIgnoreCase("weak")) {
				isWeatherNice = true;
			}
		} else if (weather.equalsIgnoreCase("overcast")) {
			isWeatherNice = true;
		}

		return isWeatherNice;
	}

}
