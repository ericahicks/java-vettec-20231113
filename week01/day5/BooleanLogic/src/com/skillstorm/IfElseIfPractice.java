package com.skillstorm;

public class IfElseIfPractice {
	
	public static void main(String[] args) {
		// Setting up an if else if block
		// based on a decision tree
		boolean isSpoiled = true;
		
		// TODO Ask the user each of these
		boolean hasUseByDatePassed = true;
		boolean wasTheUseByDateMoreThan3DaysAgo = true;
		boolean doesItSmellFunny = true;
		if (!hasUseByDatePassed) {
			// Not Spoiled?
			isSpoiled = false;
		} else if (!wasTheUseByDateMoreThan3DaysAgo) {
			isSpoiled = false;
		} else if (!doesItSmellFunny) {
			isSpoiled = false;
		} else {
			isSpoiled = true; // this is redundant
		}
		
		// TODO Print out yes or no instead of true or false
		System.out.println("Is the milk spoiled? " + isSpoiled);
			
	}

}
