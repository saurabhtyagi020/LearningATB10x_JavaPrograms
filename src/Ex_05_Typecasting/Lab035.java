package Ex_05_Typecasting;

public class Lab035 {
    public static void main(String[] args) {
        int age =45;
      //  byte b= age; // invalid - Implicit casting not allowed
        byte b = (byte)age; //vaid - Explicit casting
        System.out.println(b);

    }
}
