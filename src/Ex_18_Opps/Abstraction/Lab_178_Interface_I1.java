package Ex_18_Opps.Abstraction;

public class Lab_178_Interface_I1 {
    public static void main(String[] args) {
        TwowhillerProperty tp= new TwowhillerProperty();
        tp.bike();
        tp.scooty();
    }
}
interface Twowhiler
{
    void bike();
    void scooty();

}

class TwowhillerProperty implements Twowhiler
{

    @Override
    public void bike() {
        System.out.println("Bike implementation");
    }

    @Override
    public void scooty() {
        System.out.println("Scooty implementation");
    }
}