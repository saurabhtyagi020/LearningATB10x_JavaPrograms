package Ex_18_Opps.Polymorphism.Overloading;

public class Lab_169_Overloading {

    //Compile time polymorphism
    public static void main(String[] args) {
        Lab_169_Overloading ob = new Lab_169_Overloading();
        System.out.println(ob.addition(3,4));
      int value =  ob.addition(3,5,6);
        System.out.println(value);

    }

    int addition(int a, int b)
    {
        return a+b;
    }

    int addition(int x,int y,int z)
    {
        return x+y+z;
    }
}
