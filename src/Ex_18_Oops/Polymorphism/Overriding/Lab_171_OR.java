package Ex_18_Oops.Polymorphism.Overriding;

public class Lab_171_OR {

    public static void main(String[] args) {

        Son s1 = new Son();
        s1.home();
        s1.son_method();
        s1.father_method();

        Father f1 = new Father();
        f1.father_method();
        f1.home();

       // Son s2 = new Father(); not possible
        Father f2 = new Son(); // dynamic dispatch
        f2.father_method();
        f2.home();

    }
}
