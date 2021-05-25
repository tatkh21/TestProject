package my_Practice.saim_practice2;
import java.util.Locale;
import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words at least 6 character long:");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        int word1Length = word1.length();
        int word2Length = word2.length();

        if (word1Length < 6 || word2Length < 6){
            System.out.println("INVALID DATA");
        } else {

        String firstCharLast = word1.substring(0,4)+ word2.substring(word2.length()-3);
        String email = firstCharLast.toLowerCase() + "@cybertek.com";

        System.out.println(email);
        }


    }
}
