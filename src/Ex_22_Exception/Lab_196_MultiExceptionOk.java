package Ex_22_Exception;

import java.util.InputMismatchException;

public class Lab_196_MultiExceptionOk {
    public static void main(String[] args) {
        String str = args[0];
        Integer a = Integer.parseInt(str);
        Integer b =100;
        try {
            Integer c = 100/a;
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | InputMismatchException e) {
            System.out.println(e.getMessage());

        }


    }
}
