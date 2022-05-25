package com.test;

public class LabeledContinue {

	public static void main(String[] args) {
		
		moveto:
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{
					if(i==5 && j==5)
					{
						continue moveto;
					}
					
					System.out.println(i+" "+j);
				}
			}

	}

}
