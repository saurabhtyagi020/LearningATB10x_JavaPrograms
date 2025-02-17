package Ex_18_Oops.Polymorphism.Overloading;

public class Lab_170_Overloading_P2 {
    public static void main(String[] args) {
        Lab_170_Overloading_P2 ob = new Lab_170_Overloading_P2();
        ob.substract(6,4);
        double value = ob.substract(5.8,4.2);
        System.out.println(value);

    }

    void substract(int a,int b)
    {
        int c= a-b;
        System.out.println(c);
    }

    double substract(double x,double y)
    {
        return x-y;
    }

}
