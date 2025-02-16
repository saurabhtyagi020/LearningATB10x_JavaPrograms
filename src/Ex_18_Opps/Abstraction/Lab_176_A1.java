package Ex_18_Opps.Abstraction;

public class Lab_176_A1 {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        nurse.getDetails();
        nurse.medicalStore();
    }

}

abstract class doctor
{
    abstract void getDetails();
    void medicalStore()
    {
        System.out.println("All medical tablet will be available here! ");
    }



}

class Nurse extends doctor
{

    @Override
    void getDetails() {
        System.out.println("Doctor duty will be manage by the nurse");
    }
}
