package oops.test;

public class OverLoading {
    
    public int sum(int x, int y)
    {
        return (x+y);
    }
    
    public int sum(int x,int y,int z)
    {
        return (x+y+y);
    }
    
    public double sum(double x,double y)
    {
        return (x+y);
    }
    
    public void sum(float x,float y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        OverLoading overload=new OverLoading();
        System.out.println(overload.sum(456789973, 856378738));
        System.out.println(overload.sum(45, 78, 56));
        System.out.println(overload.sum(23.23, 67.10));
    }

}
