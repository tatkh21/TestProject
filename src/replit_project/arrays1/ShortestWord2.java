package replit_project.arrays1;

import java.util.Arrays;

public class ShortestWord2 {
    public static void main(String[] args) {
        String str = " olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] strArr = str.split(", ");
        String shortestWord = strArr[0];
        String strOfShortWords = "";
        for (String each : strArr) {
                if (each.length() < shortestWord.length())
                shortestWord = each;
        }
        for (String eachShort: strArr ) {
            if (eachShort.length() == shortestWord.length()) {
                strOfShortWords += eachShort + ", ";
            }
        }
        String[] arrOfShortWords = strOfShortWords.split(", ");
        Arrays.sort(arrOfShortWords);
        System.out.println(Arrays.toString(arrOfShortWords));

    }
}
