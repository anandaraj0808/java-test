package com.test;

 public class GreaterNumberChecking {
	
	public static void main(String args[])
	{
	 int numberOne=45,numberTwo=98,numberThree=34;
		if(numberOne>0 && numberTwo>0 && numberThree>0)
		{		
			
		if(numberOne!=numberTwo && numberTwo!=numberThree && numberThree!=numberOne)	
		{	
			if(numberOne>numberTwo && numberOne>numberThree )
			{
				System.out.println(numberOne);
			}
			else if(numberTwo>numberThree)
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
