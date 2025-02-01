package Task_29_jan;

import java.util.Scanner;

public class Lab_100_QnA_vowel_cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any character");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Vowel : "+ch);
        }
        else
            System.out.println("Consonant : "+ch);

    }
}
