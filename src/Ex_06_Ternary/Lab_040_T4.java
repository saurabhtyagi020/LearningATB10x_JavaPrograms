package Ex_06_Ternary;

public class Lab_040_T4 {
    public static void main(String[] args) {

        int a=18;

        String value= (a<10)?"a is lessthan 10":(a>20)?"a is greater 20":"not matched!";
        System.out.println(value);
    }
}
