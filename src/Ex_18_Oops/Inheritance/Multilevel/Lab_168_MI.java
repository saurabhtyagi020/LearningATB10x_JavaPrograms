package Ex_18_Oops.Inheritance.Multilevel;

public class Lab_168_MI {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.GFhome();
        s1.Fhome();
        s1.home();

        System.out.println(s1.car_count);
        System.out.println(s1.GF_car_count);
        System.out.println(s1.F_car_count);
    }
}
