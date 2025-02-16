package Ex_18_Opps.Abstraction;

public class Lab_179_Interface_I2 {
    public static void main(String[] args) {
        Main main =  new Main();
        main.dance();
        main.display();
    }
}

interface Example1
{
    void display();
    void run();
}
interface Example2
{
    void dance();
    void eat();
}

class Main implements Example1,Example2
{

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }
}