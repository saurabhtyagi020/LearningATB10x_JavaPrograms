package Task_29_jan;

import java.util.Scanner;

public class Lab_099_QnA_Maximum_two {
    // Find the Maximum of Two Numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        String max=(a>b)?"Max is a":"Max is b";
        System.out.println(max);

        int max1 =(a>b)?a:b;
        System.out.println(max1);
    }
}
