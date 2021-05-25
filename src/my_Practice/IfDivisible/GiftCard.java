package my_Practice.IfDivisible;
import java.util.Scanner;
public class GiftCard {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            System.out.println("Enter your item here:");
            Scanner scan = new Scanner(System.in);
            String item  = scan.next();
            int balance = 100;

            if (item.equals("Blanket")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 60) + "$" );
            } else if (item.equals("Charger")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 25) + "$" );
            } else if (item.equals("Hat")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 25) + "$" );
            } else if (item.equals("Headphones")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 30) + "$" );
            } else if (item.equals("Laptop")){
                System.out.println("Sorry, not enough funds on your gift card!");
            } else if (item.equals("Pants")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 50) + "$" );
            } else if (item.equals("Pillow")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 40) + "$" );
            } else if (item.equals("Smartphone")){
                System.out.println ("Sorry, not enough funds on your gift card!");
            } else if (item.equals("Socks")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 5) + "$" );
            } else if (item.equals("USB cable")){
                System.out.println("Thank you for your purchase!");
                System.out.println ("Your current balance is: " + (balance - 10) + "$" );
            } else {
                System.out.println ("Invalid item!");
            }





        }
    }

