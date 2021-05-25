package replit_project.arrays1;

import java.util.Arrays;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};
        String firstLast = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                firstLast +="" + words[i].charAt(j) + words[i].charAt(words[i].length()-1) + ",";
                break;
            }
        }
        String[] firstLastArr = firstLast.split(",");
        System.out.println(Arrays.toString(firstLastArr));


    }
}
