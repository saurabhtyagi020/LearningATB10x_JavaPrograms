package Ex_22_Exception;

public class Lab_191_Try_Catch {
    public static void main(String[] args) {

        String str = args[0];
        Integer a = Integer.parseInt(str);
        Integer b =100;
        Integer c = 0;
        try {
            c = 100/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);



    }
}
