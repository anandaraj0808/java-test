package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorOfaNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int number;
		System.out.println("Enter any number:");
		number=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}
