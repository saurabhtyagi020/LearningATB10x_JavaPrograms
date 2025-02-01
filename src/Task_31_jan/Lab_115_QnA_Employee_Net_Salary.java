package Task_31_jan;

import java.util.Scanner;

public class Lab_115_QnA_Employee_Net_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the basic salary");
        double basicPay = sc.nextDouble();
        double HRA = (basicPay*40)/100;
        double DA = (basicPay*20)/100;
        double PF = (basicPay*12)/100;
        double fixedTax = 5000;

        double totalDeduction =PF+fixedTax;
        System.out.println("totalDeduction: "+totalDeduction);

        double grossSalary = basicPay+HRA+DA;
        System.out.println("grossSalary: "+grossSalary);

        double netSalary = grossSalary-totalDeduction;
        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        System.out.println("PF: "+PF);
        System.out.println("fixedTax: "+fixedTax);


        System.out.println("Your in hand salary: "+netSalary+" ₹");


    }
}
