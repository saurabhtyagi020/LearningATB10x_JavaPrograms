package Ex_09_Switch;

import java.util.Scanner;

public class Lab_070_Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the broswer name");
        String browser = sc.next();
        switch (browser)
        {
            case "Chrome":
                System.out.println("Chrome is launched");
                break;
            case "edge":
                System.out.println("Edge is launched");
                break;
            case "firefox":
                System.out.println("firefox is launched");
                break;
            default:
                System.out.println("Enter browser is not exists!");
        }

    }
}
