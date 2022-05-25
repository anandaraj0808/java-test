package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectWithinRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int lowerLimit,upperLimit,sum=0;
		
		System.out.println("Enter the lower limit:");
		lowerLimit=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter the upper limit:");
		upperLimit=Integer.parseInt(br.readLine());
		
		for(int i=lowerLimit;i<=upperLimit;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				sum=sum+j;
			}
			
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			
			sum=0;
			
		}
		
		

	}

}
