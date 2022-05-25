package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFactorsOfNumbers 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		int number;
		System.out.println("Please enter a value:");
		number=Integer.parseInt(br.readLine());

	    for (int i = 1; i <= number; ++i) 
	    {
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	}
}
