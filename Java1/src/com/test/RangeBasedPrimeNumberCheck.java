package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeBasedPrimeNumberCheck {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		int i,count=0;
		int lowerLimit,upperLimit;
		System.out.println("enter the LowerLimit value:");
		lowerLimit=Integer.parseInt(br.readLine());
		
		System.out.println("enter the upperLimit value:");
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
