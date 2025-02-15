package Ex_18_Opps.SuperKeyword;

public class Lab_174_SuperConstructor {

    public static void main(String[] args) {
        Dog3 d3 = new Dog3();


    }
}

    class Animal2
    {
        Animal2()
        {
            System.out.println("Parent constructor!");
        }
    }

    class Dog3 extends Animal2
    {
        Dog3()
        {
            super();
            System.out.println("Dog constructor");
        }

    }

