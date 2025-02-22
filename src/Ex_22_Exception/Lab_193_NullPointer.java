package Ex_22_Exception;

public class Lab_193_NullPointer {
    public static void main(String[] args) {
        String str = null;
        try {
            str.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
