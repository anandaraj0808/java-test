package com.test;

public class NaturalNumberPrint {

	public static void main(String[] args) {
		
		int i,s;
		
		//for(initialization;condition;update){ body }
		
		/*
		 * for(i=100,s=0;i>=1;i--) { s=s+i;
		 * 
		 * } System.out.println(s);
		 */
		
		i=1;
		while(i>=100)   //Entry controlled loop
		{
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		i=100;
		
		do      //Exit controlled loop
		{
			System.out.print(i+ " ");
			i--;
		}
		while(i<=1);
		
	

	}

}
