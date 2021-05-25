package office_hours.practice_04_13_2021;
import java.util.Arrays;
import java.util.Scanner;
public class SmalestAndLongest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        String[] words = new String[input.nextInt()];
        System.out.println(Arrays.toString(words));
        input.nextLine();
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word" + (i + 1));
            words[i] = input.nextLine();
        }
        // String smalest = words[0];
        //String largest = words[0];
        String[] smalAndLarge = {words[0], words[0]};// null, null
        // 0 -> smalest
        //1 -> largest

        for (String eachWord : words) {
            if (eachWord.length() < smalAndLarge[0].length()) {
                smalAndLarge[0] = eachWord;
            }
            if (eachWord.length() > smalAndLarge[1].length()){
                smalAndLarge[1] = eachWord;
            }
        }
        System.out.println("Smalest element - " + smalAndLarge[0]);
        System.out.println("Largest element - " + smalAndLarge[1]);
        System.out.println(Arrays.toString(smalAndLarge));


    }
}
