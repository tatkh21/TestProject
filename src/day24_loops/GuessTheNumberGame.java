package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        int guessingNumber = 0;

        do {
            System.out.println("Guess the secret number ");
            guessingNumber  = scan.nextInt();
            if (guessingNumber > secretNumber){
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (secretNumber != guessingNumber);

        System.out.println("Congratulations, your secret number is " + secretNumber);


    }
}
