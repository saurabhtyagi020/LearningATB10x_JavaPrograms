package Ex_18_Opps.Polymorphism.Overriding;

public class Son extends Father {

   @Override
    void home()
    {
        System.out.println("Sons home!");
    }

    void son_method()
    {
        System.out.println("Sons method");
    }
}
