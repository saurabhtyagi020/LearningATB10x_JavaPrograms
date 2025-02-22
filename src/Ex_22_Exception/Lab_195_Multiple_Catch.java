package Ex_22_Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_195_Multiple_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        String str = sc.next();
        Integer a = Integer.parseInt(str);
        Integer b =100;
        Integer c = 0 ;
        try {
            c = 100/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
         catch (ArrayIndexOutOfBoundsException  e) {
        System.out.println(e.getMessage());
    }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
