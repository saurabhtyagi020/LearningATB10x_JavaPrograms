package Ex_18_Oops.Abstraction;

public class Lab_177_A2 {
    public static void main(String[] args) {
        Specification cs = new Specification();
        cs.carDetails();
    }
}

abstract class Car
{
    abstract void carDetails();
    void display()
    {
        System.out.println("Car complete method!");
    }
}

class Specification extends Car
{


    @Override
    void carDetails() {
        System.out.println("Race");
        System.out.println("Engine");
        System.out.println("Gear");
    }
}


