package com.test;

public class BreakTest {

	public static void main(String[] args) {
		
		/*
		 * for(int i=1;i<=10;i++) { if(i==5) { break; } System.out.println(i); }
		 * 
		 * int i=1; while(i<=10) { if(i==5) { break; }
		 * 
		 * System.out.println(i); i++;
		 * 
		 * }
		 * 
		 * 
		 * i=1; do { if(i==5) { break; }
		 * 
		 * System.out.println(i); i++;
		 * 
		 * 
		 * } while(i<=10);
		 */
		
	int i=1;
	
	while(i<=10)
	{
		int j=1;
		while(j<=10)
		{
			if(i==2 && j==2)
			{
				break;
			}
			System.out.println(i + " "+j);
			j++;
		}
		i++;
	}
	}
}

	


