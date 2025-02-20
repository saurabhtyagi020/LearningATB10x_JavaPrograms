package Task_20_feb;

public class Task_02_Encap {
    public static void main(String[] args) {
        SBI sbi = new SBI("Saurabh",76);
        System.out.println(sbi.getName());
        System.out.println(sbi.getAmount());
    }
}
class SBI
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    private String name;
    private long amount;

    public SBI(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }


}
