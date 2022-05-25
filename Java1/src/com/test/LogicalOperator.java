package com.test;

public class LogicalOperator {

	public static void main(String[] args) {
		
		 int numberOne=10,numberTwo=30;
		 
		 if(numberOne>0 && numberOne==20)
		 {
			 System.out.println("numberOne is positive and equal to 10");
		 }
		 
		 if(numberTwo>0 || numberTwo<numberOne)
		 {
			 System.out.println("numberTwo is positive and greater than numberOne");
		 }

	}

}
