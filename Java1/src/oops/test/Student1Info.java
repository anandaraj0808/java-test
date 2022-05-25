package oops.test;

public class Student1Info {
    
    private String name;
    private int age;
    private String address;
    
    Student1Info()
    {
        this.name="Unknown";
        this.age=0;
        this.address="Not available";
    }

    public void setinfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    

    public void setinfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        
        Student1Info s1=new Student1Info();
        
        System.out.println(s1);
        
        Student1Info s2=new Student1Info();
        s2.setinfo("Anand", 23);
        
        System.out.println(s2);
        
        
        Student1Info s3=new Student1Info();
        s3.setinfo("Anand", 23,"Kvp");
        System.out.println(s3);

    }

}