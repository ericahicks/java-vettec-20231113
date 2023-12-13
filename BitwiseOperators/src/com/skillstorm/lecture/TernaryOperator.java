package com.skillstorm.lecture;

import java.util.Random;

public class TernaryOperator {
	
	public static void main(String[] args) {
		// The last operator we have not used yet is called the "ternary operator"
		
		int x = 1;
		int y = 2;
		int z = (x > y) ? x : y;
		
		boolean coin = new Random().nextBoolean();
		System.out.println(coin ? "HEADS" : "TAILS"); // must put one and exactly one value as true and false case
		
		boolean a = true;
		boolean b = false;
		boolean c = (a) ? ( (b) ? x > y : x == 0 ) : Math.random() > 0.5;
		
		if (a) {
			if (b) {
				c = x > y;
			} else {
				c = x == 0 ;
			}
		} else {
			c = Math.random() > 0.5;
		}
		
		            
	}

}
