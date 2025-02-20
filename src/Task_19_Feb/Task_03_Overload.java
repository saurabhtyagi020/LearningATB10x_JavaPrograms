package Task_19_Feb;

public class Task_03_Overload {
    public static void main(String[] args) {
        Addition add = new Addition(2,4,5);
    }
}
class Addition
{
    Addition(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    Addition(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
