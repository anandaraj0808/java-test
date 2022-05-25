package com.test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		int number,noOfDigits=0,sum=0,k;
		System.out.println("Enter anty number:");
		number=scan.nextInt();
		int copyOfNumber=number;
		k=number;
		
		//Count of digits
		for(;copyOfNumber>0;copyOfNumber=copyOfNumber/10)
		{
			noOfDigits=noOfDigits+1;
		}
		
		
		while(number>0)
		{
			int rem=number%10;
			sum=sum+(int)Math.pow(rem, noOfDigits);
			number=number/10;
		}
		
		if(sum==k)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
		
	}

}
