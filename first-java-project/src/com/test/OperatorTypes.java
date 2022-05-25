package com.test;

public class OperatorTypes {

	public static void main(String[] args) {
	
		int firstNumber=30,secondNumber=67;
		
		
		if(firstNumber>0 && firstNumber==40)
		{
			System.out.println("firstNumber is nonzero and equal to 30");
		}
		
		if(secondNumber>firstNumber || secondNumber>0)
		{
			System.out.println("secondNumber is nonzero and greater than firstNumber");
		}
		
		firstNumber+=30; //firstNumber=firstNumber+30
		
		int a=10;
		System.out.println(a<<3);
		System.out.println(a>>2);
		
		
	}

}
