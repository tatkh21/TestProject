package day49_static;

public class bankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "husband";
        husband.showBalance();//500
        husband.spend(100);
        husband.showBalance();
        
        

    }
}
