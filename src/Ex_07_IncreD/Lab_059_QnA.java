package Ex_07_IncreD;

public class Lab_059_QnA {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);//45
        int num2 = Integer.parseInt(args[1]);//85

        int maxNumber= (num1>num2)?num1:num2;
        System.out.println(maxNumber);//85

    }
}
