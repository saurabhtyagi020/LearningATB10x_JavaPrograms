package Ex_15_String_function;

public class Lab_123_Stringbuilder_buffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("saurabh");
        System.out.println(sb.append("Tyagi"));

        System.out.println(sb.delete(1,3));
        System.out.println(sb.reverse());
      // -------------------
        System.out.println("---------------------");
        StringBuffer sb1 = new StringBuffer("kumar");
        System.out.println(sb1.append("sharma"));
        StringBuffer r1 = sb1.reverse();
        System.out.println(r1);
    }
}
