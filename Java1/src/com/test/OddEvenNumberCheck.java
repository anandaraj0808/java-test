package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenNumberCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int number;
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		System.out.println("Please enter a value:");
		number=Integer.parseInt(br.readLine());
		
		if(number%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}