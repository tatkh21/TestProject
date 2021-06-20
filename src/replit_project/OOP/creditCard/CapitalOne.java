package replit_project.OOP.creditCard;

public class CapitalOne extends CreditCard{
    public CapitalOne() {}
    public CapitalOne(long cardNumber, double balance) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.apr = 14.35;
        this.cashBack = false;
    }
    @Override
    public void useCard() {
        System.out.println("Using Capital One card");
    }
    @Override
    public void payBalance(double b) {
        System.out.println("Paying $" + b + " from " + this.balance);
    }
    @Override
    public String toString() {
        return "Capital One credit card | " +
                "cardNumber: " + cardNumber +
                " | balance: " + balance +
                " | APR : " + apr +
                " | has cashBack :" + cashBack;
    }

}
