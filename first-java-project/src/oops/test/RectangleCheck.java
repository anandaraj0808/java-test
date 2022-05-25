package oops.test;

public class RectangleCheck {

	private float length;
	private float width;
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double area()
	{
		return this.length * this.width;
	}
	
	public double perimeter()
	{
		return 2*(this.length + this.width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
	public static void main(String args[])
	{
		RectangleCheck rect=new RectangleCheck();
		rect.setLength(20);
		rect.setWidth(15);
		
		rect.toString();
		
		System.out.println(rect.area());
		
		System.out.println(rect.perimeter());
		
	}
	
	
	
	
}