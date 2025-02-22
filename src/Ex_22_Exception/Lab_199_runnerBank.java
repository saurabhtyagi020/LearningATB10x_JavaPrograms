package Ex_22_Exception;

public class Lab_199_runnerBank {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",1000);
        Bank icici = new Bank("INR",8900);
        Bank jp = new Bank("USD",1000);
       int result =sbi.add(jp);
        System.out.println(result);
    }
}
