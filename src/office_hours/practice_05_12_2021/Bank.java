package office_hours.practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccountOne = new BankAccount();
        String s = "a";
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 21355;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));


    }

}
