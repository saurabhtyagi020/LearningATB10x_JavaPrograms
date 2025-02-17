package Ex_18_Oops.SuperKeyword;

public class Lab_173_SuperMethod {
    public static void main(String[] args) {
        dog1 d1 = new dog1();
        d1.bark();

        }
    }


class Animal1
{
    void bark()
    {
        System.out.println("Bark animal1");
    }
}

class dog1 extends Animal1
{
    void walk()
    {
        System.out.println("Dog1 walk");
    }
    void bark()
    {
        System.out.println("Bark dog");
        super.bark();// parent class
    }

}
