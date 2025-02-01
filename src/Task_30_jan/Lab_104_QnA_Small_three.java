package Task_30_jan;

import java.util.Scanner;

public class Lab_104_QnA_Small_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number to check smallest one");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String smallestNum = (a<b&&a<c)?"Smallest is a":(b<a&&b<c)?"Smallest is b":"Smallest is c";
        System.out.println(smallestNum);

        if(a<b)
        {
            System.out.println("Smallest is a: "+a);
        }
        else if(b<c)
        {
            System.out.println("Smallest is b: "+b);
        }
        else
        {
            System.out.println("Smallest is c: "+c);
        }
    }
}
