package oops.test;

public class BikeImplementaion  implements Bike{

    @Override
    public void test() {
        System.out.println("This is test method");
        
    }

    @Override
    public void demo() {
        System.out.println("This is demo method");      
    }

    public static void main(String args[])
    {
        Bike bike=new BikeImplementaion();
        bike.demo();
        bike.test();
    }
}