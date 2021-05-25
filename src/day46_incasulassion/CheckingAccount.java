package day46_incasulassion;

public class CheckingAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;
    private String type = "checking";
    //

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                '}';
    }
    public void setAccountInfo(long accountNumber, String accountHolder, double balance, String type) {

    }

    public void setType(String type) {
        this.type = type;
    }
}


