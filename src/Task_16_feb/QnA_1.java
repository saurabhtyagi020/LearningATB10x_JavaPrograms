package Task_16_feb;

public class QnA_1 {
    public static void main(String[] args) {
       PrintMyBook pb = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);
       pb.getDetails();
    }
}

abstract class Book
{
    String name;
    String author;
    int price;

    Book(String b_name,String a_author,int p_price)
    {
        this.name = b_name;
        this.author = a_author;
        this.price = p_price;
    }

    abstract void getDetails();
}

class PrintMyBook extends Book
{

    PrintMyBook(String b_name, String a_author, int p_price) {
        super(b_name, a_author, p_price);
    }

    @Override
    void getDetails() {
        System.out.println(name + ", " + author + ", " +price);

    }
}



