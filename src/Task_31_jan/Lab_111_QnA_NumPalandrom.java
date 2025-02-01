package Task_31_jan;

public class Lab_111_QnA_NumPalandrom {
    public static void main(String[] args) {
        int num = 454;
        int temp =num;
        int rev = 0;
        for(;num>0;) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp==rev)
        {
            System.out.println("Number is palindrome: "+temp);
        }
        else
        {
            System.out.println("Number is not palindrome: "+temp);
        }
    }
}

