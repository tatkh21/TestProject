package my_Practice.saim_practice_loop2;
import java.util.Scanner;
public class PolindromWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        String reverseWord = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
             reverseWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println(word + " is polindrome word ");
        } else {
            System.out.println(word + " is not a polindrome word");
        }


    }
}
