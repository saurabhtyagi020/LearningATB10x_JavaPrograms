package Task_19_Feb;

public class Task_02_Parameterized {
    public static void main(String[] args) {
        FATHER father = new FATHER("Raja",455);

    }
}
class FATHER
{
    FATHER(String name,int amount)
    {
        System.out.println("I am the parametrized constructor!");
        System.out.println(name);
        System.out.println(amount);

    }
}

