package Ex_18_Opps.Abstraction;

public interface Lab_180_I3 {

    void I1();
    public void I2();

}

class New implements Lab_180_I3
{

    @Override
    public void I1() {
        System.out.println("I1");
    }

    @Override
    public void I2() {
        System.out.println("I2");

    }
}

