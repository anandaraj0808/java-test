package oops.test;

public class StudentMain {

	public static void main(String[] args) {
		
		Student studentOne=new Student(101,"Raman","Mumbai");
		Student studentTwo=new Student(102,"Mohan","Chennai");
		
		studentOne.takeAdmission();
		studentOne.studentExam();
		studentOne.checkResult();
		studentOne.displayStudent();
		
		
		
		studentTwo.takeAdmission();
		studentTwo.studentExam();
		studentTwo.checkResult();
		studentTwo.displayStudent();
		
	}

}
