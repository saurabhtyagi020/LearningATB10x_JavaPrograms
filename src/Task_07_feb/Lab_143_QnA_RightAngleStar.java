package Task_07_feb;

import java.util.Scanner;

public class Lab_143_QnA_RightAngleStar {
    public static void main(String[] args) {
        //Right-Angled Triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}
