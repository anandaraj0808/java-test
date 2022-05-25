package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int a,b,temp;
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		System.out.println("Please enter a value:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
	}

}
