package com.skillstorm.importexs;

// https://docs.oracle.com/javase/8/docs/technotes/guides/language/static-import.html
// static imports let us drop the name of the class when referring to static methods/properties
//import static com.skillstorm.importexs.UsefulDates.months;

public class Student {
	
	String name;
	int graduationYear;
	int graduationMonth;
	int graduationDay;
	
	public String getGraduationMonth() {
		return UsefulDates.months[graduationMonth];
//		return months[graduationMonth];
	}
	
	public void printGraduation() {
		System.out.printf("Graduating on %s %d, %d %n", getGraduationMonth(), graduationDay, graduationYear);
	}

}
