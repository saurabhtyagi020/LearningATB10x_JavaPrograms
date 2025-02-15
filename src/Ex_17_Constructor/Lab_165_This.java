package Ex_17_Constructor;

public class Lab_165_This {

    public static void main(String[] args) {
        mobile m1 = new mobile("vivo",2018);
        System.out.println(m1.model);
        System.out.println(m1.year);

        m1.details();

        mobile m2 = new mobile("iphone",2025);
        System.out.println(m2.model);
        System.out.println(m2.year);

        m2.details();

    }

}

class mobile
{
    String model;
    int year;

    mobile(String model_name,int model_year)
    {
        this.model = model_name;
        this.year = model_year;
    }

    void details()
    {
        System.out.println(this.model+ " ---"+ this.year);
    }


}
