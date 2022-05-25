package oops.test;

class A1
{
 protected long number1=20;
 
 public void testA()
 {
      System.out.println("This is a method(class A)");
 }
    
}


class B1 extends A1 {

      protected long number2=40;
      
      public void testB()
      {
          System.out.println("This is a method(class B)");
      }

}


class C1 extends B1
{
    
    protected long number3=60;
      
      public void testC()
      {
          System.out.println("This is a method(class C)");
      }
    
    
}

public class MultiLevelInheritence {

    public static void main(String[] args) {
        
        C1 ob=new C1();
        System.out.println(ob.number1);
        System.out.println(ob.number2);
        System.out.println(ob.number3);
        
        ob.testA();
        ob.testB();
        ob.testC();
        
        B1 b=new B1();
        b.testA();
        b.testB();
        

    }

}