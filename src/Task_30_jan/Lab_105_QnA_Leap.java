package Task_30_jan;

import java.util.Scanner;

public class Lab_105_QnA_Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check the leap year");
        int year=sc.nextInt();

        if(year%4==0)
        {
            System.out.println("Year is leap year: "+year);
        }
        else
        {
            System.out.println("Year is not a leap year: "+year);
        }
    }
}
