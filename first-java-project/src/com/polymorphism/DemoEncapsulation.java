package com.polymorphism;
class Encapsulation
{
    //private variables declared
    //these can only be accessed  by 
    //public methods of the class
    private String name;
    private int rollNo;
    private int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        
}




public class DemoEncapsulation {

    public static void main(String[] args) {
        
        Encapsulation ob=new Encapsulation();
        //Setting values of the variables
        ob.setName("Bhusan");
        ob.setAge(23);
        ob.setRollNo(1);
        
        
        //displaying value of the variables
        System.out.println(ob.getName());
        System.out.println(ob.getRollNo());
        System.out.println(ob.getAge());
        
        //Direct access to the name,rollNo and age is not possible due to encapsulation
        
        

    }

}

