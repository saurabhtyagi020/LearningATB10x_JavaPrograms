package Ex_18_Opps.Polymorphism.Overriding;

public class Lab_172_Real {
    public static void main(String[] args) {

        testCase2 t2 = new testCase2();
        t2.openBrower();

        testCase1 t1 = new testCase1();
        t1.openBrower();
        t1.testCaseexecute();

        baseTest b1 = new testCase1();//Dynamic dispatch
        b1.openBrower();
    }

}

class baseTest
{
    void openBrower()
    {
        System.out.println("Open browser in 5 sec");
    }
}

class testCase1 extends baseTest
{

    void testCaseexecute()
    {
        System.out.println("Execution started!");
    }
}

class testCase2 extends baseTest
{
    @Override
    void openBrower()
    {
        System.out.println("Open browser in 2 sec!");
    }
}
