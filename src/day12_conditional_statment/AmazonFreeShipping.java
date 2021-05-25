package day12_conditional_statment;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your total price =" + totalPrice);
        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPING");
        }
        System.out.println("Thank you for shoping with us!");
    }
}
