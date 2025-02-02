package Task_01_feb;

import java.util.Scanner;

public class Lab_117_QnA {
    public static void main(String[] args) {
        //Check if a Number is Divisible by 5 and 11
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("Number is divisible 5 & 11: "+num);
        }
        else
        {
            System.out.println("No divisible by 5 &11: "+num);
        }

    }
}
