package Ex_17_Constructor;

public class Car2 {
    String model;
    int year;
    String color;

    Car2(String model_name,int mf_year,String color_name)
    {
        this.model = model_name;
        this.year =mf_year;
        this.color = color_name;
        System.out.println("I am a parametrized constructor!");
    }
}
