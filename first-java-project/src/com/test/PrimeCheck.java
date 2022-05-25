package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeCheck {

	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		 
		
		int i,count=0;
		int lowerLimit,upperLimit,sum=0;
		
		System.out.println("Enter the lower limit:");
		lowerLimit=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter the upper limit:");
		upperLimit=Integer.parseInt(br.readLine());
		
		for(int j=lowerLimit;j<=upperLimit;j++)
		{
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.print(j+" ");
			}
			count=0;
		}
		
	}
}
