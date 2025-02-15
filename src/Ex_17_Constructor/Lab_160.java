package Ex_17_Constructor;

public class Lab_160 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Vikas";
        s1.branch="CS";
        s1.rollNo=123;

        System.out.println(s1.name);
        System.out.println(s1.branch);
        System.out.println(s1.rollNo);

        System.out.println("----------------------");

        Student s2 = new Student();
        s2.name = "Sumit";
        s2.branch = "Ec";

        System.out.println(s2.rollNo=345);
        System.out.println(s2.name);
        System.out.println(s2.branch);
    }
}
