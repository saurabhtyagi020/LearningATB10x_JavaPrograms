package Task_31_jan;

import java.util.Scanner;

public class Lab_114_QnA_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter exp years ");
        int year = sc.nextInt();
        System.out.println("Please enter you salary");
        double salary = sc.nextFloat();
        double bonusfor1to3 =(salary*5)/100;
        double bonusfor4to6 =(salary*10)/100;
        double bonusforabove6 =(salary*15)/100;
        if(year<1)
        {
            System.out.println("No bonus your are less than 1 year!");
        }
        else if(year>=1&&year<=3)
        {
            System.out.println("Your bonus is: "+bonusfor1to3);
        }
        else if(year>=4&&year<=6)
        {
            System.out.println("Your bonus is: "+bonusfor4to6);
        }
        else if(year>=6)
        {
            System.out.println("Your bonus is: "+bonusforabove6);
        }
    }
}
