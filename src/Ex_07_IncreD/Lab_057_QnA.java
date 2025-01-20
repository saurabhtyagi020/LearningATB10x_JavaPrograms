package Ex_07_IncreD;

public class Lab_057_QnA {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);//58

        //A-->Exp1-->19-->a->19
        // B--> Exp2--> 19-->a->20
        //C-->exp3-->20--->a-19
    }
}
