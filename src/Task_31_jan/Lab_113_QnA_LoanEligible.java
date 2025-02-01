package Task_31_jan;

import java.util.Scanner;

public class Lab_113_QnA_LoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age in integer!");
        int age = sc.nextInt();

        if(age>0 && age>=18 && age<=80)
        {
            System.out.println("Enter your salary!");
        }
        else
        {
            System.out.println("Your are not eligible for loan");
        }

        double salary = sc.nextDouble();
        if(salary>0 && salary>=30000)
        {
            System.out.println("Enter your credit score!");
        }
        else
        {
            System.out.println("Your are not eligible for loan");
        }

         int creditScore= sc.nextInt();
        if(creditScore>0 && creditScore>=650 && creditScore<=850)
        {
            System.out.println("Your are eligible for loan");
        }
        else
        {
            System.out.println("Your are not eligible for loan");
        }
    }
}
