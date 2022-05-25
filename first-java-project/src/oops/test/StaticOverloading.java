//Static 

package oops.test;

public class StaticOverloading {

    public static int test(int a)
    {
        return 10;
    }
    
    
    public static char test(int a,int b)
    {
        return 'X';
    }
    
    public static void main(String[] args) {
        
        System.out.println(StaticOverloading.test(1));
        System.out.println(StaticOverloading.test(1,2));

    }

}