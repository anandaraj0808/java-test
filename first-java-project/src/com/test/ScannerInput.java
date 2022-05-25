package com.test;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
	
		int number;
		long phone;
		String name;
		double salary;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number:");
		number=input.nextInt();
		
		
		System.out.println("Enter your phone number:");
		phone=input.nextLong();
		
		input.nextLine();
		System.out.println("Enter your name:");
		name=input.nextLine();
		
		System.out.println("Enter your salary:");
		salary=input.nextDouble();
		
		
		System.out.println(number+ "\n" + phone +"\n"+ name +"\n"+ salary);

	}

}
