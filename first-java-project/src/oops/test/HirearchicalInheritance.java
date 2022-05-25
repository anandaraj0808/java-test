package oops.test;

class Parent
{
 protected long number1=20;
 
 public void parent()
 {
      System.out.println("This is a parent method");
 }
    
}

class Child1 extends Parent
{
     protected long c1=10;
     public void child1Method()
     {
         System.out.println("child1 method");
     }
    
}

class Child2 extends Parent
{
     protected long c2=10;
     public void child2Method()
     {
         System.out.println("child2 method");
     }
    
    
}

class Child3 extends Parent
{
     protected long c3=10;
     public void child3Method()
     {
         System.out.println("child3 method");
     }
    
    
}


public class HirearchicalInheritance {

    public static void main(String[] args) {
        
     Child1 child1=new Child1();
     child1.parent();
     System.out.println(child1.number1);
     
     Child2 child2=new Child2();
     child2.parent();
     System.out.println(child2.number1);
    }

}