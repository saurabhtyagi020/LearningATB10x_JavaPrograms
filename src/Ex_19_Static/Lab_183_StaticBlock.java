package Ex_19_Static;

public class Lab_183_StaticBlock {
    public static void main(String[] args) {
        ABC abc = new ABC();
        ABC.sMethod();

    }
}

class ABC
{
    static
    {
        System.out.println("I am static block!");
    }

    void function()
    {
        System.out.println("No static function");
    }
    static void sMethod()
    {
        System.out.println("I am static method!");
    }
}
