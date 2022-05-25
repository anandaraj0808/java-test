package oops.test;

class Shape
{
 
 public void shape()
 {
      System.out.println("This is Shape");
 }
    
}

class Rectangle1 extends Shape
{
     public void printRectangle()
     {
         System.out.println("This is Rectangular Shape");
     }
    
}

class Circle1 extends Shape
{
     public void printCircle()
     {
         System.out.println("This is Circular Shape");
     }
    
    
}

class Square extends Rectangle1
{
     public void printSquare()
     {
         System.out.println("This is Subclass for Square");
     }
      
}

