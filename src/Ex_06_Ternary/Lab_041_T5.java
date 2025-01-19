package Ex_06_Ternary;

public class Lab_041_T5 {
    public static void main(String[] args) {
        int a=20;
        int b=25;
        int c=65;

        int max= (a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        System.out.println(max);
    }
}
