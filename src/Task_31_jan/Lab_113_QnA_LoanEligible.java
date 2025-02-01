package Task_31_jan;

import java.util.Scanner;

public class Lab_113_QnA_LoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 18 || age > 80)
        {
            System.out.println("You are not eligible for a loan!");
        }
        else
        {
            System.out.println("Enter your salary");
            double salary = sc.nextDouble();

            if (salary < 30000)
            {
                System.out.println("You are not eligible for a loan");
            }
            else
            {
                System.out.println("Enter your credit score");
                int creditScore = sc.nextInt();

                if (creditScore >= 650 && creditScore <= 850) {
                    System.out.println("You are eligible for a loan!");
                } else {
                    System.out.println("You are not eligible for a loan.");
                }
            }
        }
    }
}