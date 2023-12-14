package com.skillstorm;

public class CheckpointQuestion {
	
	public static void main(String[] args) {
		String[] exercises = { "pushups", "pullups", "situps", "squats" };
		
		int reps = 0;
		for (int i = 0; i < 5; i++) {
			for (String ex : exercises) {
				if (ex.equals("squats")) continue;
				reps += 20;
			}
		}
		System.out.println("reps=" + reps);
	}

}
