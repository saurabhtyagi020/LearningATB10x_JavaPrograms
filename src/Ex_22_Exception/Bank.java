package Ex_22_Exception;

public class Bank {
    private String currency;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }


}
