package my_Practice.saim_practice2_arrays;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] wordsArr =  words.split(", ");
//        for (String each : wordsArr) {
//            if (each.contains(" ")) {
//               System.out.println(each);
//            }
//        }
        for (String each : wordsArr) {
            System.out.println(each);
        } for (int i = 0; i < wordsArr.length; i++ ) {
            System.out.println(wordsArr[i]);
        }

    }
}
