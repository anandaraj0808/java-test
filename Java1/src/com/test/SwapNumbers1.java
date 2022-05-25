package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNumbers1 {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int a,b;
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		System.out.println("Please enter a value:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
