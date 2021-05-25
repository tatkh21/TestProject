package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);
        for (String w : words) {
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] words1 = googleResult.split(" ");
        for (String each : words1){
            System.out.println(each);
        }
        System.out.println("Count = " + words1[1]);
        System.out.println("seconds = " + words1[3].replace("(", ""));
        System.out.println("seconds = " + words1[3].substring(1, words[3].length()));


    }
}
