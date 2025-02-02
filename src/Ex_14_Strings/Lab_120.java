package Ex_14_Strings;

public class Lab_120 {
    public static void main(String[] args) {
        String s1= "Hello";// SCP
        String s2 = "Hello";

        String s3= s1+s2;
        System.out.println(s3);

        String s4 = new String("Hello"); // Head area or OA
        String s5 = new String("hello"); //

        System.out.println(s1==s2);// true
        System.out.println(s1==s4);//false
        System.out.println(s1.equals(s2));// true

        System.out.println(s4==s5);//false
        System.out.println(s4.equals(s5));//false

    }
}
