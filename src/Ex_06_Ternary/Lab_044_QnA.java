package Ex_06_Ternary;

public class Lab_044_QnA {
    public static void main(String[] args) {
        int a=90;
        int b=110;
        int c=150;
        //(a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        int maxNum= (a>=b&&a>=c)?a:(c>=a&&c>=b)?c:b;
     //   int maxNum= (a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        System.out.println(maxNum);


    }
}
