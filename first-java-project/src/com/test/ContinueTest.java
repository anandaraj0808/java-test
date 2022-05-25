package com.test;

public class ContinueTest {

	public static void main(String[] args) {
		
		int i=10;
		
		for(;i>=1;i--)
		{
			if(i==5)
			{
				continue;
			}
			
			System.out.println(i);
		}

	}

}
