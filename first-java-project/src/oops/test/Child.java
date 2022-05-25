package oops.test;

public class Child implements Three {

    @Override
    public void test() {
        System.out.println("This is test method");
        
    }

    @Override
    public void demo() {
        
        System.out.println("This is demo method");
    }

    @Override
    public void sample() {
        
        System.out.println("This is sample method");
    }
    
    public static void main(String args[])
    {
        Child c=new Child();
        c.demo();
        c.test();
        c.sample();
        
    }

}
