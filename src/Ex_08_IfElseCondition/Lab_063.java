package Ex_08_IfElseCondition;

import java.util.Scanner;

public class Lab_063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the num1");
        int num1 =sc.nextInt();

        System.out.println("ENter the num2");
        int num2 =sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Num1 is greater!");
        }
        else if(num2>num1)
        {
            System.out.println("Num2 is greater!");
        }
        else
            System.out.println("Both are equal");
    }
}

