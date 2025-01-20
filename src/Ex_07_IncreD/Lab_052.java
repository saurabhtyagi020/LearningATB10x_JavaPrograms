package Ex_07_IncreD;

public class Lab_052 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);//22
        System.out.println(a);//12
        //a++-->A-Exp1-10/a-11
        // ++a--B-Exp2- 12 /a-12
    }
}
