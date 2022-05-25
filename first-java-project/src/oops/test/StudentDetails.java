package oops.test;

public class StudentDetails 
{
	private int rollNumber;
	private String name;
	private String phoneNumber;
	private String address;
	
	StudentDetails (int rollNumber,String name,String phoneNumber,String address)
	{
	  this.rollNumber=rollNumber;
	  this.name=name;
	  this.phoneNumber=phoneNumber;
	  this.address=address;
	}
	public void displayStudent()
	{
		System.out.println(rollNumber+ " "+name+" "+" "+phoneNumber+" "+address);
	}


}
