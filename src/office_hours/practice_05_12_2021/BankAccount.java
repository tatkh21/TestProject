package office_hours.practice_05_12_2021;

public class BankAccount {

    String accountHolderName;//null
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin) {
        if (pin == inputPin) {
            return balance;
        }
        return -1;

    }

    public static void main(String[] args) {

    }
}
