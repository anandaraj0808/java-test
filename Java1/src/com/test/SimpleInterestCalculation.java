package com.test;

public class SimpleInterestCalculation {

	public static void main(String[] args) 
	{
		double interestAmount,principalAmount,rateOfInterest,timeInYears;
		principalAmount=5000;
		rateOfInterest=5;
		timeInYears=3;
		
		
		interestAmount=(principalAmount*rateOfInterest*timeInYears)/100;
		
		System.out.println("Amount="+interestAmount);
		

	}

}
