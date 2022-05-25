package com.test;

public class ForLoopExample {

	public static void main(String[] args) 
	{
int i;
//		
//		for(i=100;i>=1;i--)   //Reverse Printing Numbers from 100 to 1
//		{
//			System.out.println(i+",");
//		}
//		for(i=1;i<=100;i++)  //Forward Printing Numbers from 1 to 100
//		{
//			System.out.println(i+",");
//		}
//		
//		for(i=1,s=0;i<=100;i++)  //Sum of Numbers from 1 to 100
//		{
//			
//			System.out.println(i+",");
//		}
		
		
		
		i=1;
		while(i>=100) {
			System.out.println(i+" ");
			i++;
		}
		
		i=100;
		do {
			System.out.println(i+" ");
			i--;
			
		}
		while(i<=1);
		
		
	}
}
