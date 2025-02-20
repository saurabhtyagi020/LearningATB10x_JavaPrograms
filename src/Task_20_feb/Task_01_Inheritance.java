package Task_20_feb;

public class Task_01_Inheritance {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display1();
        ch.display();
    }
}
class Father
{
    void display()
    {
        System.out.println("Parent class!");
    }
}
class Child extends Father
{
    void display1()
    {
        System.out.println("Child class!");
    }
}
