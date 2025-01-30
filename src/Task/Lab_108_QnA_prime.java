package Task;

import java.util.Scanner;

public class Lab_108_QnA_prime {
    public static void main(String[] args) {
        //Check if a Number is Prime
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number to check prime number");
        int num = sc.nextInt();
        int flag=0;
        if(num==0||num==1)
        {
            System.out.println(num+" is not prime number");
        }
        for(int i=2;i<num;i++)
        {

            if(num%i==0)
            {
                flag=1;
                System.out.println(num+" is not prime number");
                break;
            }
        }
        if(flag==0) {
            System.out.println(num+ " is prime number");
        }

    }
}
