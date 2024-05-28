import java.util.Scanner;
public class Student {
    int rollno;
    String name;
  
    public Student(int rno,String n)
    {
        this.rollno=rno;
        this.name=n;
    }
    //copy constructor

    public Student (Student s)
    {
        this.rollno=s.rollno;
        this.name=s.name;
    }

    public void display()
    {
        System.out.println("Rollno=" +this.rollno+ "\n" + "Name=" +this.name);

    }

    @Override
    public Object clone()
    {
        return new Student(this);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll no:");
        int rollno=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name=sc.nextLine();

        Student s1=new Student(rollno,name);
        s1.display();

        Student s_s1=new Student(s1);
        s_s1.display();

        Student s2=(Student)s_s1.clone();

        System.out.println(s2);



        
    }
    

}

