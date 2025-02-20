package Task_20_feb;

public class Task_04_Overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Animal an = new Dog();
        an.eat();
        an.run();
        }
    }


class Animal
{
    void eat()
    {
        System.out.println("Animal can eat!");
    }
    void run()
    {
        System.out.println("running");
    }

}
class Dog extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Dog can eat!");
    }
}