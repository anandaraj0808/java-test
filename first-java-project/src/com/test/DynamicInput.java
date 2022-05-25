package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicInput {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int firstNumber,secondNumber;
		String name;
		long phone;
		double salary;
		
		 InputStreamReader ins=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(ins);
		 
		 System.out.println("Enter any number:");
		 firstNumber=Integer.parseInt(br.readLine());

		 System.out.println("Enter any number:");
		 secondNumber=Integer.parseInt(br.readLine());
		 
		 System.out.println("Enter your name:");
		 name=br.readLine();
		 
		 System.out.println("Enter your contact number:");
		 phone=Long.parseLong(br.readLine());
		 
		 System.out.println("Enter your salary");
		 salary=Double.parseDouble(br.readLine());
		 
		 
		 System.out.println(name);
		 System.out.println(phone);
		 System.out.println(salary);
		 if(firstNumber>secondNumber)
		 {
			 System.out.println(firstNumber);
		 }
		 else
		 {
			 System.out.println(secondNumber);
		 }
	}

}
