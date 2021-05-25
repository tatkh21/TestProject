package day13_conditional_statments;
import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main (String[]args){
        System.out.println("****WELCOME TO TD BANK***\nPlease enter your pincode. ");
        Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;
        int inputPinCode = scan.nextInt();

        if (secretPincode == inputPinCode){
            System.out.println("Welcome to your account.\nYou can withdraw, check balance, deposit.");
        } else {
            System.out.println("Incorrect pincode " + inputPinCode + "\n Please try again");
        }
            System.out.println("Thank you for choosing TD Bank ATM!");
    }

}
