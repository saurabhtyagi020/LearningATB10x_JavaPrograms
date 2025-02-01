package Task_31_jan;

import java.util.Scanner;

public class Lab_116_QnA_Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Visa status");
       // boolean visaStatus = sc.nextBoolean();
        String visaStatus1 = sc.next();

        if(age>=18&& age>0)
        {
           // if(visaStatus==true)
            if(visaStatus1.equalsIgnoreCase("valid"))
            {
                System.out.println("You can travel");
            }
         //   else if(visaStatus==false)
            else if(visaStatus1.equalsIgnoreCase("invalid"))
            {
                System.out.println("Not eligible to travel");
            }
        }
        else
        {
            System.out.println("Not eligible to travel");
        }
    }
}
