package Task_07_feb;

import java.util.Scanner;

public class Lab_144_QnA_InvertedTriangle {
    public static void main(String[] args) {
        //Inverted Right-Angled Triangle.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i=num;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
