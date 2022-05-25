package oops.test;

public class Employee {
	//Instant Variables
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeAddress;
	private double employeeSalary;
	
	//Constructor
	Employee(int employeeId,String employeeName,String employeeDesignation,String employeeAddress,double employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeDesignation=employeeDesignation;
		this.employeeAddress=employeeAddress;
		this.employeeSalary=employeeSalary;
		
	}
	
	public void calculateHRA()
	{
		double hra=(this.employeeSalary*10)/100;
		System.out.println("HRA = " +hra);
	}
	
	public void calculateDA()
	{
		double da=(this.employeeSalary*50)/100;
		System.out.println("DA = " +da);
	}
	
	public void calculateIncomeTax()
	{
		double tax=(this.employeeSalary*20)/100;
		System.out.println("Income Tax = " +tax);
	}
	
   public void displayEmployee()
   {
	   System.out.println("Employee Id:"+this.employeeId);
	   System.out.println("Employee name:"+this.employeeName);
	   System.out.println("Employee Designation:"+this.employeeDesignation);
	   System.out.println("Employee Address:"+this.employeeAddress);
	   System.out.println("Employee Basic Salary:"+this.employeeSalary);
   }

}
