package com.skillstorm.casting;

public class DataTypeCasting {
	
	public static void main(String[] args) {
		// Double to float
		// Rounding double to float can have some unexpected behavior due to 
		//  the fact we can't accurately represent some values with scientific notation
		//   1.something x 10^something
		double x = 1.123456989123456 ;
		System.out.println((float)x);
		
		
		
		// Example combining different types
//		int y = 1.0 / 3; CTRLALT DOWNARROW copies this line below
		double z = 1.0 / 3;
		System.out.println(z);
		
		// Automatic casting is done for us to the bigger type
		double a = 1.0;
		float b = 2.0f;
		double c = a + b;
		
		byte d = 1;
		byte e = 2;
		int f = d + e;
		
		
	}

}
