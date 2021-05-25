package day46_incasulassion;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount();
        account1.setAccountHolder("Tatyana K");
        account1.setAccountNumber(435678389087L);
        account1.setBalance(1_000_000);
        account1.setType("360 checking");

        System.out.println("Account1 = " + account1);

    }
}
