package Ex_07_IncreD;

public class Lab_051 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);//10+11

        // A  + B
        // A -> a++ -> Exp1(A) -> 10 , a-> 11
        // +
        // B -> a -> a -> 11 ->  Exp2 -> 11
        // A + B -> 10 + 11 -> 21


        // Line No. |  a |  Exp
        // 5  |  10 | NA
        // 6  | 11 | 10 + 11 |


    }
}
