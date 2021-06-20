package replit_project.OOP.creditCard;

public class Discover extends CreditCard{
    public Discover() {
    }
    public Discover (long cardNumber, double balance) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.apr = 11.99;
        this.cashBack = true;
    }
    @Override
    public void useCard() {
        System.out.println("Using Discover card");
    }
    @Override
    public void payBalance(double b) {
        System.out.println("Paying $" + b + " from " + this.balance);
    }
    @Override
    public String toString() {
        return "Discover credit card | " +
                "cardNumber: " + cardNumber +
                " | balance: " + balance +
                " | APR : " + apr +
                " | has cashBack :" + cashBack;
    }

}
