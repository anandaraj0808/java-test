package oops.test;

public class Student 
{
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	Student(int studentId,String studentName,String studentAddress)
	{
	  this.studentId=studentId;
	  this.studentName=studentName;
	  this.studentAddress=studentAddress;
	}
	
	public void takeAdmission()
	{
		System.out.println("This is take admission method!!");
	}
	
	public void studentExam()
	{
		System.out.println("This is student exam method!!");
	}
	
	public void checkResult()
	{
		System.out.println("This is check result method!!");
	}
	
	public void displayStudent()
	{
		System.out.println(studentId+ " "+studentName+" "+studentAddress);
	}

}
