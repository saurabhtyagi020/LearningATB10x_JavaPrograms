package Task;

import java.util.Scanner;

public class Lab_103_QnA {
    public static void main(String[] args) {
        //Find the Smallest of Two Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();

        if(a<b)
        {
            System.out.println("a is smallest number: "+a);
        }
        else
        {
            System.out.println("b is smallest number: "+b);
        }
        // using ternary

        String smallest= (a<b)?"Smallest a":"Smallest b";
        System.out.println(smallest);


    }


}
