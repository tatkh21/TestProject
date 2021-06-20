package replit_project.OOP.creditCard;

public class CreditCard {
    long cardNumber;
    double balance;
    double apr;
    boolean cashBack;


     public void useCard(){
     }
    public void payBalance(double b) {}

    @Override
    public String toString() {
        return "CreditCard | " +
                "cardNumber: " + cardNumber +
                " | balance: " + balance +
                " | APR : " + apr +
                " | has cashBack :" + cashBack +
                '}';
    }
}
