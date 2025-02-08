package Task_07_feb;

import java.util.Scanner;

public class Lab_140_QnA {
    public static void main(String[] args) {
        // Factorial of a Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int num = sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);



    }
}
