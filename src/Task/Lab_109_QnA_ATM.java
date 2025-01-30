package Task;

import java.util.Scanner;

public class Lab_109_QnA_ATM {
    public static void main(String[] args) {
        //ATM Withdrawal Simulation

        int amount = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdraw amount");
        int withdrawAmt= sc.nextInt();

        if(withdrawAmt>0 && withdrawAmt%100==0 && withdrawAmt<10000)
        {
            System.out.println("Transaction successfully!");
            updatedBalance(amount,withdrawAmt);
        }

        else
        {
            System.out.println("Withdraw fail!");
        }

    }
    static void updatedBalance(int amount, int withdrawAmt )
    {
            int amountBalance = amount- withdrawAmt;
            System.out.println("Balance left : "+amountBalance);
    }
}
