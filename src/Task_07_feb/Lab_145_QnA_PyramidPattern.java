package Task_07_feb;

import java.util.Scanner;

public class Lab_145_QnA_PyramidPattern {
    public static void main(String[] args) {
        //Pyramid Pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
