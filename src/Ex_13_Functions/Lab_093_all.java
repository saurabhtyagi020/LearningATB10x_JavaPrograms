package Ex_13_Functions;

public class Lab_093_all {
    public static void main(String[] args) {

        //1. No parameter/argument no return type.

        greet();
        //2. No parameter/argument but return type.

        String value=method2();
        System.out.println(value);

       int value2= methdod2int();
        System.out.println(value2);

        //3. with parameter but no return type.

        method3("Raja");

        //4. with parameter and with return type.

        String str=method4("Vikas","Kumar");
        System.out.println(str);

        int add=method4(15,15,15);
        System.out.println(add);
    }
    //1. No parameter/argument no return type.
    //2. No parameter/argument but return type.
    //3. with parameter but no return type.
    //4. with parameter and with return type.


    //1. No parameter/argument no return type.

    static void greet()
    {
        System.out.println("Hello.. How are you?");
    }

    //2. No parameter/argument but return type.

    static String method2()
    {
        return "Hi.. I am method 2";
    }

    static int methdod2int()
    {
        return 23;
    }

    //3. with parameter but no return type.

    static void method3(String name)
    {
        System.out.println(name);
    }

    //4. with parameter and with return type.

    static String method4(String firstName,String lastName)
    {
        return firstName + lastName;
    }

    static int method4(int a,int b,int c)
    {
        return a+b+c;
    }


}
