package com.test;

public class SmallestNumberChecking {
	
	public static void main(String args[])
	{
		int numberOne=55,numberTwo=108,numberThree=21;
	if(numberOne>0 && numberTwo>0 && numberThree>0)
	{		
		
	if(numberOne!=numberTwo && numberTwo!=numberThree && numberThree!=numberOne)	
	{	
		if(numberOne<numberTwo && numberOne<numberThree )
		{
			System.out.println(numberOne);
		}
		else if(numberTwo<numberThree)
		{
			System.out.println(numberTwo);
		}
		else
		{
			System.out.println(numberThree);
		}
	}
	else
	{
		System.out.println("Two or more numbers are equal!!");
	}
	}
	
	else
	{
	 System.out.println("Zero not allowed!!");	
	}
	}
}