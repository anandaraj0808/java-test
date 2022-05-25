package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfFactors 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		int number,Sum=0;
		System.out.println("Please enter a value:");
		number=Integer.parseInt(br.readLine());	
		
		int i=1;  
		while(i <= number/2)  
		{  
		if(number % i == 0)  
		{  
		Sum = Sum + i;  
		}
		i++;  
		}
		if(Sum==number)  
		{  
		System.out.println(number+" is a perfect number.");  
		} 
		else 
		{
		System.out.println(number+" is not a perfect number.");   
		}  
	}
}

//Another type using For Loop
//for(i=1;i<no;i++)
//{
//	if(no%i==0)
//	{
//		temp+=i;
//		
//		
//	}
//	
//}
//if(temp==no)
//{
//	System.out.println("No is Perfect");
//}
//else
//{
//	System.out.println("No is not Perfect");
//}
