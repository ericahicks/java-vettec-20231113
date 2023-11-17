package com.skillstorm.strings;

public class ModulusExample {
	
	public static void main(String[] args) {
		// I'm on a gameboard 10x10 and I'm on square 25
		// What row and column is this?
		int numRows = 10;
		int numCols = 10;
		
		int myLocation = 25;
		
		int myCol = myLocation % numCols; // wrap back to 0 every time
		int myRow = (int) Math.ceil((double) myLocation / numCols); // how many times have I gone across a row? 10 + 10 + 5
		
		System.out.println("my row and col are " + (myRow) + "x" + (myCol));
		
		
		
		
		//      col1 ... col5
		// row -----------------
		// row2
		// row3           x
	}

}
