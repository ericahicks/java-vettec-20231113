package com.skillstorm.lecture.protectedex;

import java.util.Random;

public class ProtectedIssueEx extends Random {
	
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10));
//		System.out.println(random.next(3)); // can't call this method bc protected 000 001 010 110
		
		
		
		MyRandom myRandom = new MyRandom();
		System.out.println(myRandom.nextInt());
		System.out.println(myRandom.nextInt(10));
		System.out.println(myRandom.next(3));
		
	}
	

}
