package com.skillstorm.lecture;

public class ExamplesDecimal {

	public static void main(String[] args) {
		int x = 1;
		int y = 10;
		int z = 100;

		int a = 0b1;
		System.out.println(a);

		int b = 0b10;
		System.out.println(b);

		int c = 0b100;
		System.out.println(c);
		
		///////////////////////////////////////////////
		// using shift instead of division by 2 -- only works for positives
		System.out.println("d=5 in decimal");
		int d = 0b101;
		System.out.println(d);
		System.out.println("d >> 1 is divide by 2 chop off decimal");
		System.out.println(d >> 1);
		
		int e = -4;
		System.out.println(e >> 1);
		
		boolean t = true;
		boolean f = false;
		System.out.println(t || f);
		System.out.println(t | f);
		
		x = 1;
		y = 2;
		if (x > y && y++ > 0) {
			// do something
		}
		System.out.println(x + ", " + y); // 1, 2
		
		x = 1;
		y = 2;
		if (x > y & y++ > 0) {
			// do something
		}
		System.out.println(x + ", " + y); // 1, 3
	}

}
