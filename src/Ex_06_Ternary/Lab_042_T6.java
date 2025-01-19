package Ex_06_Ternary;

public class Lab_042_T6 {
    public static void main(String[] args) {
        String ageString =args[0];
        int age =Integer.parseInt(ageString);
        String category=  (age<18)? "Minor": (age<25)?"Adult":"Senior";
        System.out.println(category);
    }
}
