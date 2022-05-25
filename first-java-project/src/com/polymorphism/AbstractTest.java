package com.polymorphism;
abstract class Base
{
    Base() //Constructor of base class
    {
        System.out.println("This is Base class constructor..");
    }
    
    //abstract method
    abstract void test();
    //non-abstract method
    void foo()
    {
        System.out.println("This is a non-abstract method ");
    }
    
    
    //final method
    final void welcome()
    {
        System.out.println("Welcome User");
    }
    
    //static method
    static void bye()
    {
        System.out.println("Bye...");
    }
    
}

class Derived extends Base
{
    Derived()
    {
        System.out.println("Derived class constructor");
    }
    
    
    
      @Override void test() { System.out.println("Abstract method's body");
      
      }
      
      
     
}


public class AbstractTest {

    public static void main(String[] args) {
        
        Base b=new Derived();
        b.welcome();
        b.foo();
        
       b.test();
       b.bye();
         
    }

}
