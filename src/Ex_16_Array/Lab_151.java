package Ex_16_Array;

import java.util.Scanner;

public class Lab_151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();

        int a [] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the value");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
