package Task_07_feb;

import java.util.Scanner;

public class Lab_141_QnA_Prime_number {
    public static void main(String[] args) {
        //Check if a Number is Prime
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check number is prime or not");
        int num = sc.nextInt();
        boolean isPrime = true;
       if(num<2)
       {
           System.out.println("Number is not a prime number: "+num);
       }
       for (int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                System.out.println("Number is not a prime number: "+num);
                break;
            }
        }

       if(isPrime==true)
       {
           System.out.println("Number is a prime number: "+num);
       }

    }
}
