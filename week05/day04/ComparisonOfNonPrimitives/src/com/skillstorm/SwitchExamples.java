package com.skillstorm;

public class SwitchExamples {
	
	public static void main(String[] args) {
		// default can be anywhere in the order
		// but will still only run if none of the other cases match
		int x = 1;
		switch (x) {
		case 0: System.out.println(0);
		default: System.out.println("default");
		case 1: System.out.println(1);
		}
		System.out.println();
		
		// here we can fall through to the default in the case of 0 and 1 
		// but not -1 which is only possible bc default does not have to be 
		// at the end
		x = 1;
		switch (x) {
		case 0: System.out.println(0);
		case 1: System.out.println(1);
		default: System.out.println("default");
			break;
		case -1: System.out.println(1);
		}
	}

}
