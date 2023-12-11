package com.skillstorm;

public class FinallyExamples {
	
	public static void main(String[] args) {
		try {
			System.out.println("Doing stuff");
			if (Math.random() > 0.5)
				throw new RuntimeException("whoops"); // Scenario 1: RuntimeException is thrown
			                                          // Scenario 2: try-completes successfully
//		} catch (IllegalArgumentException e) { // Never runs!!!
		} catch (RuntimeException e) { // Runs in scenario 1
//		} catch (Throwable e) { // Runs in scenario 1 
//		} catch (Exception e) { // Runs in scenario 1
			System.out.println("\n================\nIn the catch block");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\n================\nthis finally runs"); // runs in scenario 1&2
		}
		System.out.println("\nEnd of main");
	}

}
