package office_hours.practice_04_28_2021;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));

    }
    // toCharArray -> sort -> equal?
    // loop through one string and remove the char that you etarate through
    // in the other String -> if empty the second string is emty?

    public static boolean isAnagram(String one,String two) {
        if (one.length() != two.length()) {
            return false;
        }
        one = one.toLowerCase();//listen
        two = two.toLowerCase();//silent
        int [] count = new int[26];
        // listen -> l + 1, i + 1 , s + 1
        //silent -> s -1, i - 1, ect

        // a ->0, b=1, c = 2
        // z -> 25
        for (int i = 0; i < one.length(); i++) {

            char letterFromOne = one.charAt(i);// a ->97 - 97, b
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;
        }
        return Arrays.equals(count, new int[26]);

    }
}
