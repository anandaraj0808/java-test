package oops.test;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1=new Employee(123,"Mr. Sudhir","Manager","Kolkata",50000.0);
        employee1.displayEmployee();
        employee1.calculateDA();
        employee1.calculateHRA();
        employee1.calculateIncomeTax();
        
        
        Employee employee2=new Employee(125,"Mr. Mohan","Analyst","Delhi",40000.0);
        employee2.displayEmployee();
        employee2.calculateDA();
        employee2.calculateHRA();
        employee2.calculateIncomeTax();
	}

}
