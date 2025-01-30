package Task;

public class Lab_102_QnA {
    public static void main(String[] args) {

       // Find the Largest of Three Numbers.
        int a = 101;
        int b = 209;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("Largest number is a: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is b: " + b);
        } else {
            System.out.println("Largest number is c: " + c);
        }

        //using ternary

        int max = (a>b &&a>c)?a:(b>a&&b>c)?b:c;
        System.out.println(max);

        String max1 = (a>b&&a>c)?"a max":(b>a&&b>c)?"b max":"c max";
        System.out.println(max1);
    }
}
