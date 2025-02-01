package Task_31_jan;

import java.util.Scanner;

public class Lab_114_QnA_Bill_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit");
        int unit = sc.nextInt();
        double unitTill100 = unit*0.50;
        double next100 = unit*0.75;
        double next100_2 = unit*1.20;
        double above300 = unit*1.50;

        if(unit<=100)
        {
            System.out.println("This month generated bill: "+unitTill100);
        }
        else if(unit>=101 && unit<200)
        {
            System.out.println("This month generated bill: "+next100);
        }
        else if (unit>=201 && unit<300)
        {
            System.out.println("This month generated bill: "+next100_2);
        }
        else if(unit>300)
        {
            System.out.println("This month generated bill: "+above300);
        }

    }
}

