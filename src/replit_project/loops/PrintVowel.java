package replit_project.loops;
import java.util.Scanner;
public class PrintVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String vowel = "";
        for (int i = 0; i < word.length(); i++) {
            String letters = word.charAt(i) + "";
            switch (letters) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    vowel += letters;


            }

        }
        System.out.println(vowel);
    }
}
