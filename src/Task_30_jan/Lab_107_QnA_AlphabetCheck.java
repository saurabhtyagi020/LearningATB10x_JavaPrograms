package Task_30_jan;

import java.util.Scanner;

public class Lab_107_QnA_AlphabetCheck {
    public static void main(String[] args) {
        //Check if a Character is an Alphabet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word or letter to check the character");
        char ch = sc.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
        {
            System.out.println("Its a character: "+ch);
        }
        else
        {
            System.out.println("Its not a character: "+ch);
        }
    }
}
