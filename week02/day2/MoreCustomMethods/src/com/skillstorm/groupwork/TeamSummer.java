package com.skillstorm.groupwork;

import java.util.Scanner;

/**
 * 
 * Code from the group assignment
 * https://stormsurge.skillstorm.com/courses/3835/assignments/33592
 * 
 * @author Sean, Saugat, Josh, Abdelnasser
 */
public class TeamSummer {
	

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

        System.out.print("Is the weather Overcast? ");
        boolean isOvercast = scanner.nextLine().equalsIgnoreCase("yes");
        if (isOvercast)
            return true;

        System.out.print("Is it Sunny? ");
        boolean isSunny = scanner.nextLine().equalsIgnoreCase("yes");

        if (isSunny) {
            System.out.print("Is humidity Normal? ");
            return scanner.nextLine().equalsIgnoreCase("yes");
        } else {
            System.out.println("Is it wind Weak? ");
            return scanner.nextLine().equalsIgnoreCase("yes");
        }
    }

}
