package office_hours.practice_05_19_2021;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(removeLongString2(list, 5));

    }
    public static ArrayList<String> removeLongString(ArrayList<String> list, int minLength) {

        ArrayList<String> validString = new ArrayList<>();

        for (String word : list) {
            if (word.length() >= minLength) {
                validString.add(word);
            }
        } return validString;
    }
    public static ArrayList<String> removeLongString2(ArrayList<String> list, int minLength) {
        list.removeIf(each -> each.length() < minLength);
        return list;
    }
}

