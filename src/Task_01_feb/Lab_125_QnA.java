package Task_01_feb;

import java.util.Scanner;

public class Lab_125_QnA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url");
        String url = sc.next().toLowerCase();

        if(url.endsWith(".com"))
        {
            System.out.println(" The website type is: Commercial website: "+url);
        }
        else if(url.endsWith(".org"))
        {
            System.out.println("The website type is: Non-profit organization: "+url);
        }
        else if(url.endsWith(".edu"))
        {
            System.out.println("The website type is: Educational institution: "+url);
        } else if (url.endsWith(".gov"))
        {
            System.out.println("The website type is: Government website: "+url);
        }
        else if (url.endsWith(".net"))
        {
            System.out.println("The website type is: Network-related website: "+url);
        }
        else if(url.endsWith(".info"))
        {
            System.out.println("The website type is: Informational website "+url);
        }
        else
        {
            System.out.println("The website type is: Unknown or other types of websites: "+url);
        }


    }
}
