package Ex_10_forloop;

import java.util.Scanner;

public class Lab_085_QnA {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2,
        // consnants - 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to check the vowel and consonant count");
        String str = sc.next();
        int vCount =0;
        int conCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vCount++;
            }

            else
            {
                conCount++;
            }
        }
        System.out.println("Vowel count: "+vCount);
        System.out.println("Consonant count: "+conCount);


    }
}
