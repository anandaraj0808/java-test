package oops.test;

 class A
{
  protected long number1=20;
  
  public void testA()
  {
	  System.out.println("This is a parent class method");
  }
	
}



 class B extends A {

	  protected long number2=40;
	  
	  public void testB()
	  {
		  System.out.println("This is a child class method");
	  }

}
 
public class SingleLevelInheritence
{
	public static void main(String args[])
	{
		B ob=new B();
		ob.testA();
		ob.testB();
		System.out.println(ob.number1);
		System.out.println(ob.number2);
	}
}
