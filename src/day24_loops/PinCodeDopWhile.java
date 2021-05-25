package day24_loops;
import java.util.*;

public class PinCodeDopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pinCode;// declare here so that it is visible for WHILE condition
        int secretPincode = 1234;
        do {
            System.out.println("+++++++Welcome to your accuont++++++++++++");
            System.out.println("Enter your pincode");
            pinCode = scan.nextInt();
        } while (pinCode != secretPincode);

    }
}
