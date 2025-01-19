package Ex_05_Typecasting;

public class Lab034 {
    public static void main(String[] args) {
        byte b=45;
       // int a=b; //implicit casting automatically
        int a= (int)b; //Explicit casting
        System.out.println(a);
    }
}
