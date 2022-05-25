package oops.test;

public class Circle 
{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return this.radius*this.radius*Math.PI;
	}
	
	public double circumference()
	{
		return 2*Math.PI*this.radius;
	}
	
	@Override
	public String toString() {
		return "Circle [length=" + radius + "]";
	}

	public static void main(String args[])
	{
		Circle a=new Circle();
		a.setRadius(20);
		
		a.toString();
		
		System.out.println(a.area());
		
		System.out.println(a.circumference());
		
	}
}
