package com.skillstorm;

public class CircuitWorkout {
	
	public static void main(String[] args) throws InterruptedException {
		// Plan a circuit workout
		
		// burpees 10x
		// planks 1min
		// push-ups 15 pushups
		// squats 20
		
		// Repeat 4x through
		
		int round = 0;
		while (round < 4) {
			int numBurpees = 10;
			System.out.println("Get ready for burpees...And go!");
			while (numBurpees > 0) {
				Thread.sleep(30);
				System.out.println("Burpee " + (numBurpees--)); // change after printing
//				System.out.println("Burpee " + (--numBurpees)); // change before printing
			}
			System.out.println("Rest");
			Thread.sleep(200);
			int countPlankSecs = 60;
			System.out.println("Get ready for plank...And go!");

			while (countPlankSecs > 0) {
				System.out.println(--countPlankSecs);
				Thread.sleep(10);
			}
			System.out.println("rest");
			round++;
		}
	}

}
