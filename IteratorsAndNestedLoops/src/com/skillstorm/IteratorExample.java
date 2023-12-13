package com.skillstorm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>(Arrays.asList("apples", "bananas"));
		
		// Under the hood let's use an iterator instead of for each!
		Iterator<String> itr = strs.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		for (String str : strs) {
			System.out.println(str);
		}
		
		String[] animals = { "cats", "dogs" };
		Iterator<String> itr2 = Arrays.asList(animals).iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
//		itr2.next(); // Exception in thread "main" java.util.NoSuchElementException
		
		for (Iterator<String> itr3 = Arrays.asList(animals).iterator(); itr3.hasNext();  ) {
			System.out.println(itr3.next());
		} // end of loop
		
		System.out.println("End of main");
	} // end of main
}
