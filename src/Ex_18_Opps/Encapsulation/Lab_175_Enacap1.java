package Ex_18_Opps.Encapsulation;

public class Lab_175_Enacap1 {
    public static void main(String[] args) {
        ICICIBANK C1 = new ICICIBANK("Saurabh",10000);
        System.out.println(C1.getBalance());
        C1.setBalance(12000,false);

       // System.out.println(C1.getBalance());


    }

}

class ICICIBANK
{
   private String name;
   private int balance;
    public ICICIBANK(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance,boolean iscashier) {
        if(iscashier==true) {
            this.balance = balance;

        }
        else
        {
            System.out.println("Not allowed!");
        }

    }
}
