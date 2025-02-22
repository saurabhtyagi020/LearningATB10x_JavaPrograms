package Ex_22_Exception;

public class Lab_198_throw {
    public static void main(String[] args) {

        validateAge(17);
        System.out.println();
    }

    public static void validateAge(int age)
    {
        if(age<18)
        {
            try {
                throw new Exception("Age should be greater than 18");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Age is correct!");
        }
    }
}
