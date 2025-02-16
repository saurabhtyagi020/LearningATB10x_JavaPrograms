package Ex_19_Static;

public class Lab_184_Static_S1 {
    public static void main(String[] args) {
        Automation ab = new Automation();
        System.out.println(ab.browser);
        Automation.browser= "edge";
        System.out.println(Automation.browser);
        Automation.browser="firefox";
        System.out.println(Automation.browser);

    }
}

class Automation
{
    static String browser= "chrome";
}
