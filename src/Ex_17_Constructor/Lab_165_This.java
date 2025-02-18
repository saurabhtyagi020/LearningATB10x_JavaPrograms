package Ex_17_Constructor;

public class Lab_165_This {

    public static void main(String[] args) {
        mobile m1 = new mobile("vivo",2018);
        System.out.println(m1.model);
        System.out.println(m1.year);

        System.out.println("-----xxx---");
        m1.details();
        System.out.println("--------");
        String modelmm=m1.mobilemodel();
        System.out.println(modelmm);
        int yearyy=m1.mobileYear();
        System.out.println(yearyy);

        mobile m2 = new mobile("iphone",2025);
        System.out.println(m2.model);
        System.out.println(m2.year);

        System.out.println("--------");

        m2.details();
        System.out.println("--------");
        String model1=m2.mobilemodel();
        System.out.println(model1);
        int year1=m2.mobileYear();
        System.out.println(year1);

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

    String mobilemodel()
    {
        return this.model;
    }
    int mobileYear()
    {
        return this.year;
    }


}
