package Ex_18_Opps.SuperKeyword;

public class Lab_172_Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.colorMethod();
    }


}
class Animal
{
    String color ="White";
}
class Dog extends Animal
{
    String color = "Black";
    void colorMethod()
    {
        System.out.println(color);// prefer to local variable means black
        System.out.println(super.color);// its refer of parent class variable
    }
}