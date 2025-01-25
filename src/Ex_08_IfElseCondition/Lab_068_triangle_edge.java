package Ex_08_IfElseCondition;

import java.util.Scanner;

public class Lab_068_triangle_edge {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side2 → eq, iso, scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3");
        int side3 = sc.nextInt();


        if (side1 < 0 || side2 < 0 || side3 < 0) {
            System.out.println("enter the value is positive");
        } else {
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("Triangle is equilateral");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is scalene");
            }


        }
    }
}
