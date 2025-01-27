package Ex_13_Functions;

public class Lab_095_QnA {
    public static void main(String[] args) {
        //1. Reverse the number using for loop. (In - 12345, Out - 54321)

        int num =12345;
        int revNum=0;

        for(;num>0;)
        {
            int lastDigit =num%10;
            revNum = revNum*10+lastDigit;
            num=num/10;


        }
        System.out.println(revNum);
    }
}
