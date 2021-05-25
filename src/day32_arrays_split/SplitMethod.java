package day32_arrays_split;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);
        for (String each : wordsArray){
            System.out.println(each);
        }
        String str = "today I am coding java arrays";
        String[]  strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println("There are " + strArr.length + " words in this sentence");
        System.out.println("first word " + str.split(" ")[0]);

        for (String each : strArr) {
            System.out.println(each);
        }


    }
}
