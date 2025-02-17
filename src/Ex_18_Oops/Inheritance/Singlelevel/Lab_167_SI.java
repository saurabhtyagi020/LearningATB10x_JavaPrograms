package Ex_18_Oops.Inheritance.Singlelevel;

public class Lab_167_SI {
    public static void main(String[] args) {
        myWork m2 = new myWork();
        m2.display();

    }

}

class myWork  {
    String name = "Rajiv";

    void display() {
        System.out.println("Display method one");
    }


    class myWork2  extends  myWork{

        void display2() {
            System.out.println("Display method two");
        }
    }
}

