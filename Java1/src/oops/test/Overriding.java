package oops.test;

class P
{
    void show()
    {
        System.out.println("Parent's show method");
    }
    
}

class C extends P
{
    void show()
    {
        System.out.println("Child's show method");
    }
}



public class Overriding {

    public static void main(String[] args) {
        P p=new P();
        p.show();
        
        P p1=new C(); //Runtime Polymorphism
        p1.show();

    }

}

