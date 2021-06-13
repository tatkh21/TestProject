package replit_project.methodsFromReplits;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList <String> wordList = new ArrayList (Arrays.asList("hi","hey","hi","hi","hi", "hi", "hello","yo"));
        String word = "hi";
        System.out.println(removeAll(wordList,word));

    }
    public static ArrayList<String> removeAll(ArrayList<String> allwords, String word) {
        for (int i = 0; i < allwords.size(); i++) {
            if (allwords.get(i).equals(word)) {
                allwords.remove(i);
                i--;
            }
        }

        return allwords;
    }
}
