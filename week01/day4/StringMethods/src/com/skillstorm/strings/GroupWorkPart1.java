package com.skillstorm.strings;

public class GroupWorkPart1 {
	
	public static void main(String[] args) {
		String str = "Hello world!";
		/* Print using substring:
		    ello
			world
			o
			!
		 */
		System.out.println(str.substring(1, 6));
		System.out.println(str.substring(7, str.length() - 1));
		System.out.println(str.substring(4,5));
		System.out.println(str.substring(str.length() - 1));
	}

}
