package com.skillstorm;

import java.util.Scanner;

public class GameController {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Adventure Game!");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		
		System.out.println("Hi, " + name + ". Game under construction. Please try again later.");
		
		in.close();
	}

}
