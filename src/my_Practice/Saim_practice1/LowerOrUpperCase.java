package my_Practice.Saim_practice1;
import java.util.Scanner;
public class LowerOrUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char letter = scan.next().charAt(0);
        if (letter >= 65 && letter <= 90) {
            System.out.println(letter + " is an uppercase letter");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " is a lowercase letter");
        } else {
            System.out.println(letter + " is not a letter" );
        }
    }
}
