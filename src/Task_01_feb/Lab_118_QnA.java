package Task_01_feb;

import java.util.Scanner;

public class Lab_118_QnA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days");
        int days = sc.nextInt();
        int years = days/365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int day = remainingDays % 30;

        System.out.println(years+" years "+months+" months "+day+" days ");
    }
}
