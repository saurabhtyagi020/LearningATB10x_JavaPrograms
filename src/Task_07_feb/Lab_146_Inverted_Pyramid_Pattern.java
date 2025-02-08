package Task_07_feb;

import java.util.Scanner;

public class Lab_146_Inverted_Pyramid_Pattern {
    public static void main(String[] args) {
        // Inverted Pyramid Pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
