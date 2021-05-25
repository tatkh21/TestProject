package office_hours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourOrLess {
    public static void main(String[]args) {
        //remove in ArrayList
        //remove(0)
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "java","loop","cat", "tree",
                "animal", "shortcut"));
        List<String> list2 = new ArrayList<>();

        for (String each : list) {
            if (each.length() <= 4) {
                list2.add(each);
            }
        }
        System.out.println(list2);
    }
}
