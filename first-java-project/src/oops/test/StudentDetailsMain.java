package oops.test;

public class StudentDetailsMain {

	public static void main(String[] args) 
	{
		StudentDetails studentOne=new StudentDetails(101,"Sam","9486957825","Chennai");
		StudentDetails studentTwo=new StudentDetails(102,"Jhon","6486972815","Salem");
		
		studentOne.displayStudent();
		
		studentTwo.displayStudent();

	}

}
