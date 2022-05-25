package oops.test;

public class Person {
	
	private int personId;
	private String personName;
	private String adharNo;
	private long panNo;
	private long phoneNo;
	
	//Default Constructor
	Person()
	{
		System.out.println("Default constructor invoked!!");
	}
	
	Person(int personId,String personName,String adharNo,long panNo,long phoneNo)
	{
		System.out.println("Parameterized constructor invoked!!");
		this.personId=personId;
		this.personName=personName;
		this.adharNo=adharNo;
		this.panNo=panNo;
		this.phoneNo=phoneNo;
	}
	
	
	public static void main(String args[])
	{
		Person ob=new Person();
		Person ob1=new Person(1235,"Raman","ASFGHYTRE55668526",987655677,786756539);
		Person ob3=new Person();
		ob3=ob1;//Copy Constructor
		
		System.out.println(ob1.personId+" "+ob1.personName+" "+ob1.adharNo+" "+ob1.panNo+" "+ob1.phoneNo );
		System.out.println(ob3.personId+" "+ob3.personName+" "+ob3.adharNo+" "+ob3.panNo+" "+ob3.phoneNo );
	}
}