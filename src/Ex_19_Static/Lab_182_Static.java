package Ex_19_Static;

public class Lab_182_Static {
    public static void main(String[] args) {
        Student student = new Student(12,"vikas");
        Student s1= new Student(14,"sumit");
        System.out.println(Student.collage_name);
        System.out.println(student.roll_no);
        System.out.println(student.s_name);
        System.out.println(Student.collage_name);
        Student.smethod();
    }
}

class Student
{
    int roll_no;
    String s_name;
    static  String collage_name = "ABS";

    public Student(int rno,String name)
    {
        this.roll_no = rno;
        this.s_name = name;
    }

    static void smethod()
{
    System.out.println("I am static method!");
}

}