package Task_07_feb;

public class Lab_142_QnA {
    public static void main(String[] args) {
        //Calculate the factorial of a number using a for loop:
        int num = 5;
        int fact = 1;
        for(int i=1;i<=5;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
