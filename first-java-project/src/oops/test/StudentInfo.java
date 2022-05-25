package oops.test;

public class StudentInfo 
{
	private String studentName;
	
	StudentInfo()
	{
		this.studentName="Unknown";
	}
	
	StudentInfo(String studentName)
	{
		this.studentName=studentName;
	}
	
	public static void main(String [] args) {
		
		StudentInfo student1=new StudentInfo();
		System.out.println(student1.studentName);
		
		StudentInfo student2=new StudentInfo("Anand");
		System.out.println(student2.studentName);
	}
	
	
	
	
	
}