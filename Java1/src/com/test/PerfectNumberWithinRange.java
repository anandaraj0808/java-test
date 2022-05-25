package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumberWithinRange 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		int lowerLimit,upperLimit,Sum=0;
		System.out.println("enter the LowerLimit value:");
		lowerLimit=Integer.parseInt(br.readLine());
		
		System.out.println("enter the upperLimit value:");
		upperLimit=Integer.parseInt(br.readLine());
		
		for(int i=lowerLimit;i<=upperLimit;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				Sum=Sum+j;
			}
			
			if(Sum==i)
			{
				System.out.print(i+" ");
			}
			
			Sum=0;
			
		}
	
	}

}
