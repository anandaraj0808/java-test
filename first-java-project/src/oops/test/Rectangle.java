package oops.test;

public class Rectangle 
{
	private double length;
	private double breadth;
	
	Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void calculateArea() 
	{
		double area=(this.length*this.breadth);
		System.out.println("Area of Rectangle is = "+area);	
	}

}


