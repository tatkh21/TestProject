package replit_project.methods;

import java.util.Arrays;

public class ReplaceBadWord {
    public static void main(String[] args) {
        String text = "he said bla bla bla bla";
        String badWord = "bla";
        System.out.println(clean(text,badWord));
    }
    public static String clean (String text , String badWord) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(badWord)) {
                words[i].replace(words[i], " ");
            }
        } String clean = Arrays.toString(words).trim();
        return clean;



    }
}
