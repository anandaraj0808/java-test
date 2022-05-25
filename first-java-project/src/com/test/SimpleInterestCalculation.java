package com.test;

public class SimpleInterestCalculation {

	public static void main(String[] args) {
		
		double interestAmount,principalAmount,rateOfInterest,timeInYears;
		
		principalAmount=5000;
		rateOfInterest=5;
		timeInYears=3;
		
		if(principalAmount>0 && rateOfInterest>0 && timeInYears>0)
		{
			interestAmount=(principalAmount*rateOfInterest*timeInYears)/100;		
			System.out.println("Amount="+interestAmount);
		}
		else
		{
			System.out.println("Values must be a positive number!!");
		}
	}

}
