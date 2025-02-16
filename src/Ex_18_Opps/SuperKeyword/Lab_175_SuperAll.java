package Ex_18_Opps.SuperKeyword;

public class Lab_175_SuperAll {
    public static void main(String[] args) {
        Room room = new Room();
        room.display();
    }
}

class House
{
    House()
    {
        System.out.println("Parent class constructor");
    }
    String h_name= "House name";

    void getHouse()
    {
        System.out.println("Get house in parent class");
    }
}

class Room extends House{
    Room()
    {
        super();
    }
    void display()
    {
        System.out.println(super.h_name);
        super.getHouse();
    }

}
