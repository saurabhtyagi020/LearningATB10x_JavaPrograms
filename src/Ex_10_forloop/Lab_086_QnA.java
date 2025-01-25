package Ex_10_forloop;

import java.util.Scanner;

public class Lab_086_QnA {
    public static void main(String[] args) {
        //Palidrome of String (chatAt()) - naman, →
        // reverse - naman , madam ( string = rev(str)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to check the panlandrom");
        String str = sc.next();
        String rev ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev +str.charAt(i);
        }
       if(str.equals(rev))
       {
           System.out.println("String is palandrom: "+rev);
       }
       else
       {
           System.out.println("String is not palandrom: "+rev);
       }
    }
}
