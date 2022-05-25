package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumberCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int number,s=0;
		System.out.println("Enter any number:");
		number=Integer.parseInt(br.readLine());
		
		
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				s=s+i;
			}
		}
		
		if(s==number)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Non perfect Number");
		}

	}

}
