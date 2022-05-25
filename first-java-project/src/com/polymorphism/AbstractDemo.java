package com.polymorphism;

abstract class A1
{
    abstract void a();
    abstract void b();
    abstract void c();
    
}

abstract class B1 extends A1
{

    @Override
    void a() {
        System.out.println("This is method a");
        
    }

    @Override
    void b() {
        System.out.println("This is method b");
        
    }

    
    
}

class C1 extends B1
{

    @Override
    void c() {
        System.out.println("This is method c");
        
    }
    
}

public class AbstractDemo {

    public static void main(String[] args) {
        
        C1 c=new C1();
        c.a();
        c.b();
        c.c();

    }

}
