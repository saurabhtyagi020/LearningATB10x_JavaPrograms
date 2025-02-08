package Task_07_feb;

import java.util.Scanner;

public class Lab_139_QnA {
    public static void main(String[] args) {
        //Multiplication Table of a Given Number (take the input from user).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table");
        int table = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(table*i);
        }
    }
}
