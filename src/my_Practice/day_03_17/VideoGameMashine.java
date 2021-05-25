package my_Practice.day_03_17;
import java.util.Scanner;

public class VideoGameMashine {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers of coupons: ");
        int numberOfCoupons = scan.nextInt();
        int numberOfCandy = 0;
        int numberOfGums = 0;
        String message = "";
        if (numberOfCoupons > 3) {
            numberOfCandy = numberOfCoupons / 10;
            numberOfCoupons %= 10;
            numberOfGums = numberOfCoupons / 3;
            System.out.println("numberOfGums = " + numberOfGums);
            System.out.println("numberOfCandy = " + numberOfCandy);
        }


            else{
                System.out.println("Not enough coupons");
            }
        }
    }


