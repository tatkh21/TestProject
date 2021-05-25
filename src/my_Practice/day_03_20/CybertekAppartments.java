package my_Practice.day_03_20;
import java.util.Scanner;
public class CybertekAppartments {
    public static void main (String[]args0){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        //WRITE YOUR CODE HERE:
        if (numberOfBedrooms == 1) {
            startingPrice = 1100;
            System.out.println("One Bedroom Selected\nStarting Price: " + startingPrice);
        } else if (numberOfBedrooms == 2){
            startingPrice = 1850;
            System.out.println("Two Bedroom Selected\nStarting Price: " + startingPrice);
        } else if (numberOfBedrooms == 3) {
            startingPrice = 2550;
            System.out.println("Three Bedroom Selected\nStarting Price: " + startingPrice);
        } else {
            System.out.println("No such Bedrooms available");
        }


    }
}



