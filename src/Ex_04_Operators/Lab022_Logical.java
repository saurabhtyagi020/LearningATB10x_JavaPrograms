package Ex_04_Operators;

public class Lab022_Logical {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2= false;

        boolean b3 =b1&&b2; //And-->false
        System.out.println(b3);

        boolean b4=b1||b2;// OR --> true
        System.out.println(b4);

        boolean b5= !b2; // Not -->true
        System.out.println(b5);


    }
}
