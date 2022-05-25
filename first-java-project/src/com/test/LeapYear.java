package com.test;

public class LeapYear {

	public static void main(String[] args) {
		int year ;
		
		year=2004;
		
		if(((year % 4 == 0 ) && (year % 100 != 0 )) || (year % 400 == 0))
			System.out.println("Given year is a leap year");
		else
			System.out.println("Given year is not a leap year");

	}

}
