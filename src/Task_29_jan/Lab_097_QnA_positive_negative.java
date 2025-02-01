package Task_29_jan;


import java.util.Scanner;

public class Lab_097_QnA_positive_negative {
    public static void main(String[] args) {
            //Check if a Number is Positive or Negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the positive or negative");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is positive: "+num);
        }
        else if (num<0)
        {
            System.out.println("Number is negative: "+num);

        }
        else
        {
            System.out.println("Number is zero");
        }

    }
}
