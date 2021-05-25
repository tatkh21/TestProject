package office_hours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "css", "html", "javascript", "word", "java"));
        String targetWord = "java";

        int count = 0;

        for(String word: words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }
        System.out.println(targetWord + " was found " + count + " times ");
    }// get(1)
}
