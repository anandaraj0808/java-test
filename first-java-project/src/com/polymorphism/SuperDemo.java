package com.polymorphism;
class A
{
    int a=30;
    A()
    {
        System.out.println("This is parent class constructor..");
    }
    
    public void display()
    {
        System.out.println("value of a:"+a);
    }
    
}

class B extends A
{
    B()
    {   super();
        System.out.println("This is child class contructor..");
        System.out.println(super.a);
        super.display();
    }
        
}


public class SuperDemo {

    public static void main(String[] args) {
        
    B ob=new B();
    }

}