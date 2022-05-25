package com.test;

public class SmallestNumber {

	public static void main(String[] args) {
	    //Variable declaration and initialization
	int firstNumber=90,secondNumber=78,thirdNumber=55;
		
	if(firstNumber!=secondNumber && secondNumber!=thirdNumber && thirdNumber!=firstNumber)	
	{	
		if(firstNumber>0 && secondNumber>0 && thirdNumber>0)
		{
			//Nested If block
			if(firstNumber<secondNumber && firstNumber<thirdNumber)
			{
				System.out.println(firstNumber);
			}
			else if(secondNumber<firstNumber && secondNumber<thirdNumber)
			{
				System.out.println(secondNumber);
			}
			else
			{
				System.out.println(thirdNumber);
			}
			
		}
		else
		{	
			System.out.println("Only non-zero and positive numbers are allowed!!");
		}

	}
	
	else
	{
		System.out.println("Numbers has to be unique!!");
	}

}
}
