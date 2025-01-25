package Ex_09_Switch;

public class Lab_072 {
    public static void main(String[] args) {
        int itemcode = 006;

        switch (itemcode){
            case 001,002,005:
                System.out.println(" Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Computer");
                break;
            default:
                System.out.println("None");
        }
    }
}
