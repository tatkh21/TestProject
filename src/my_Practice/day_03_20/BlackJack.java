package my_Practice.day_03_20;
import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter playscore and housescore");
        int playerScore = scan.nextInt();
        int houseScore = scan.nextInt();

        if (playerScore > 21) {
            System.out.println("player bust");
        } else if (houseScore > playerScore) {
            System.out.println("player loss");
        } else if (playerScore == houseScore) {
            System.out.println("its a tie");
        } else if (playerScore > houseScore && playerScore <= 21) {
            System.out.println("player win");
        }
    }
}