package com.test;

public class TypesOfVariable {
	
	static int firstNumber=10; //Static Variable
	
	public void print()
	{
		int secondNumber=10;  //Local variable
		System.out.println("Local variable value="+secondNumber);
	}
	
	public static void main(String args[])
	{
		int thirdNumber=30; //Instance variable
		System.out.println("Inatance variable value="+thirdNumber);
		System.out.println("Static variable value="+TypesOfVariable.firstNumber);
		
		TypesOfVariable ob=new TypesOfVariable();
		ob.print();
	}

}
