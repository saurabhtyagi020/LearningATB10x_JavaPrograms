package Ex_17_Constructor;

public class Lab_162_DC_Car {
    public static void main(String[] args) {
        Car m1 = new Car();
        System.out.println( m1.model_name);
        System.out.println(m1.color);
        System.out.println(m1.model_year);

        System.out.println("________________");

        m1.model_name = "Maruti";
        m1.color = "Black";
        m1.model_year = 2025;

        System.out.println( m1.model_name);
        System.out.println( m1.color);
        System.out.println(m1.model_year );

    }
}
