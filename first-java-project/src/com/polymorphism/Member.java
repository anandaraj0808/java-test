   
package com.polymorphism;
class Member1
{
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public Member1(String name, int age, long phoneNumber, String address, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary()
    {
      System.out.println(this.salary);
    }  
}

class Employee1 extends Member1
{
    private String specialization;
    
    Employee1(String name,int age,long phoneNumber,String address,double salary,String specialization)
    {
        super(name,age,phoneNumber,address,salary);
        this.specialization=specialization;  
    }

    public String getSpecialization() {
        return specialization;
    }    
}

class Manager1 extends Member1
{
    private String department;
    
    public String getDepartment() {
        return department;
    }

    Manager1(String name,int age,long phoneNumber,String address,double salary,String department)
    {
        super(name,age,phoneNumber,address,salary);
        this.department=department;       
    }
}

public class Member {

    public static void main(String[] args) {
        
        Employee1 emp=new Employee1("Jasreen",26,87654348,"Mumbai",12000,"accounts");
        Manager1 mgr=new Manager1("Rohan",32,978727722,"Patna",200000,"BU head");
        
        System.out.println(emp.getName()+ " "+emp.getAge()+" "+emp.getAddress()+" "+emp.getPhoneNumber()+" "+emp.getSpecialization());
        System.out.println(mgr.getName()+ " "+mgr.getAge()+" "+mgr.getAddress()+" "+mgr.getPhoneNumber()+" "+mgr.getDepartment());
    }
}
