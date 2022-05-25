package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberOrNot {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		int number,count=0;
		System.out.println("Please enter a value:");
		number=Integer.parseInt(br.readLine());
		
		for(int i=2; i<number; i++)
	      {
	         if(number%i == 0)
	         {
	            count++;
	            break;
	         }
	      }    
	      if(count==0)
	         System.out.println(number+" It is a Prime Number.");
	      else
	         System.out.println(number+" It is not a Prime Number.");
	}
}
