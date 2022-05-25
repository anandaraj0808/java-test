package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetersonNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int number,factorial=1,rem,sumOfFactorial=0;
		
		System.out.println("Enter any number:");
		number=Integer.parseInt(br.readLine()); 
		int copyOfNumber=number;
		
		while(number>0)
		{
			rem=number%10;    
			int i=1;
			while(i<=rem)
			{
				factorial=factorial*i;
				i=i+1;
			}
			sumOfFactorial=sumOfFactorial+factorial;
			number=number/10;
			factorial=1;
			
		}
		
		if(sumOfFactorial==copyOfNumber)
		{
			System.out.println("It is a Peterson Number");
		}
		else
		{
			System.out.println("It is not a Peterson Number");
		}
	}

}
