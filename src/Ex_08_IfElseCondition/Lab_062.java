package Ex_08_IfElseCondition;

import java.util.Scanner;

public class Lab_062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any int number!");
        int a=sc.nextInt();
        if(a%2==0){
        System.out.println("Number is even: "+a);
        }
        else
            System.out.println("Number is odd: "+a);
    }
}

