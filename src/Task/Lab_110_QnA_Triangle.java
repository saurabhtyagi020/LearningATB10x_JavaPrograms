package Task;

import java.util.Scanner;

public class Lab_110_QnA_Triangle {
    //Check if a Triangle is Valid Based on Three Sides;.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle!");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();

        if((side1+side2)>side3&&(side2+side3)>side1&&(side3+side1)>side2 &&side1>0 &&side2>0&&side3>0)
        {
            System.out.println("Triangle is valid!");
        }
        else
        {
            System.out.println("Triangle is not a valid triangle!");
        }
    }
}
