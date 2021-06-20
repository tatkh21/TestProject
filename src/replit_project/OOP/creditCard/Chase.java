package replit_project.OOP.creditCard;

public class Chase extends CreditCard {
    public Chase() {
    }
    public Chase(long cardnumber, double balance) {
        this.balance = balance;
        this.cardNumber = cardnumber;
        this.apr = 14.35;
        this.cashBack = false;
    }

    @Override
    public void useCard() {
        System.out.println("Using Chase card");
    }

    @Override
    public void payBalance(double b) {
        System.out.println("Paying $" + b + " from " + this.balance);
    }

    @Override
    public String toString() {
        return "Chase credit card | " +
                "cardNumber: " + cardNumber +
                " | balance: " + balance +
                " | APR : " + apr +
                " | has cashBack :" + cashBack;
    }
}
