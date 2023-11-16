package com.skillstorm.strings;

import java.util.Scanner;

public class GroupWorkPart2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the year you were born YYYY: ");
		String zodiacAnimals = 
		        String.format("%-10s", "Monkey") +
		        String.format("%-10s", "Rooster") +
		        String.format("%-10s", "Dog") +
		        String.format("%-10s", "Pig") +
		        String.format("%-10s", "Rat") +
		        String.format("%-10s", "Ox") +
		        String.format("%-10s", "Tiger") +
		        String.format("%-10s", "Rabbit") +
		        String.format("%-10s", "Dragon") +
		        String.format("%-10s", "Snake") +
		        String.format("%-10s", "Horse") +
		        String.format("%-10s", "Sheep")
		        ;
		int year = scanner.nextInt();
		int positionInList = year % 12;
		int startPositionInString = positionInList * 10;
		int endPositionInString = (positionInList + 1) * 10;
		String animal = zodiacAnimals.substring(startPositionInString, endPositionInString);
		
		System.out.println(String.format("Your zodiac animal is %s", animal));
		
		scanner.close();
	}

}
