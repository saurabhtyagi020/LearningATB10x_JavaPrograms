package Ex_17_Constructor;

public class Lab_161 {

    public static void main(String[] args) {

        cat c1 = new cat();
       cat c2 = new cat();
//        cat c2 = null;
//        new cat();
        c2.walk();

        c1.walk();

    }


}

class cat
{
    String name;

    void walk()
    {
        System.out.println("Walking");
    }


}
