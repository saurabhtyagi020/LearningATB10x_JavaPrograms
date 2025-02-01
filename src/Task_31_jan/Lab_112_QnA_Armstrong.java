package Task_31_jan;

import java.util.Scanner;

public class Lab_112_QnA_Armstrong {
    public static void main(String[] args) {
        //Check if a Number is an Armstrong Number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check armstrong");
        int num = sc.nextInt();
        int temp=num;
        int c=0;
        for(;num>0;)
        {
            int a= num%10;
            num=num/10;
            c=c+(a*a*a);
        }

        if(temp==c)
        {
            System.out.println("Number is armstrong: "+temp);
        }
        else
        {
            System.out.println("Number is not armstrong: "+temp);
        }
    }
}
