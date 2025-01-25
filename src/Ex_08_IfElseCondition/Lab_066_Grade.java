package Ex_08_IfElseCondition;

import java.util.Scanner;

public class Lab_066_Grade {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //Step1 --> i/p---> score data type int
        //step2 --> o/p--> grade A data type char
        //Step3 --> rough logic(Score>=90 && score <=100 -->A
        //Score>=80 && score <=80 --> B ....

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score!");
        char grade ='Z';
        int score= sc.nextInt();
        if(score>=90 && score<=100)
        {
           grade = 'A';
        }
        else if(score>=80&&score<=89)
        {
            grade ='B';
        }
        else if(score>=70&&score<=79)
        {
            grade ='C';
        }
        else if(score>=60&&score<=69)
        {
            grade ='D';
        }
        else if( score >100 || score <0)
        {
            System.out.println("Great! out of score");
        }
        else
        {
            grade ='F';
        }
        System.out.println("your garde is: "+grade);
    }
}
