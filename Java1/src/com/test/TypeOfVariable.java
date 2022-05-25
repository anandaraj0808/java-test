package com.test;

public class TypeOfVariable {
	static int firstnumber=10; // Static Variable
	private static TypeOfVariable ob;
	
	public void print()
	{
		int secondnumber=10; // Local Variable
		System.out.println("Local Variable Value="+secondnumber);
	}

	public static void main(String[] args) 
	{
		int thirdnumber=30; //Instance Variable
		System.out.println("Instance Variable value="+thirdnumber);
		System.out.println("Static Variable value="+TypeOfVariable.firstnumber);
		
		TypeOfVariable.ob=new TypeOfVariable();
		ob.print();
	}

}
