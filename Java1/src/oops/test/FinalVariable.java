package oops.test;

public class FinalVariable {
  
	final int a=10; //Constant
	
	public void update()
	{
		//this.a=20;
		System.out.println(a); 
	}
  
	public static void main(String[] args) {
		
		FinalVariable ob=new FinalVariable();
		System.out.println(ob.a);
	}

}