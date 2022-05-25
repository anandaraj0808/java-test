package com.test;

public class BreakTest {

	public static void main(String[] args) {
	
		aa:  //labeled break
		for(int i=1;i<=10;i++)
		{	
			
			for(int j=1;j<=10;j++)
			{
				if(i==5 && j==5)
				{
					break aa;
				}
				System.out.println(i + " "+ j);
			}
		}

	}

}

//package com.test;
//
//public class ContinueTest {
//
//	public static void main(String[] args) {
//		
//		int i=10;
//		
//		for(;i>=1;i--)
//		{
//			if(i==5)
//			{
//				continue;
//			}
//			
//			System.out.println(i);
//		}
//
//	}
//
//}