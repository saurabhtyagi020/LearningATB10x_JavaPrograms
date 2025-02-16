package Ex_20_ENUM;

public class Lab_186_enum2 {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        if(URLS.google.equals("google"))
        {
            System.out.println(" yes its google");
        }

    }
}
enum URLS
{
    google,gmail,facebook;
}
