package Task_20_feb;

public class Task_03_Overloading {
    public static void main(String[] args) {
        Addition ad = new Addition();
        ad.add(45,56,55);
    }
}

class Addition
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }

    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }


}