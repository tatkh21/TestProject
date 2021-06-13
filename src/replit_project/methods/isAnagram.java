package replit_project.methods;

import java.sql.Array;
import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String str1 = "star";
        String str2 = "RATS";
        System.out.println(strAnagram(str1,str2));
    }
    public static boolean strAnagram (String a, String b) {
        if ((a.length() != b.length())) {
            return false;
        }
        String one = a.toLowerCase();
        String two = b.toLowerCase();
        int [] count = new int [26];

        for (int i = 0; i < one.length(); i++) {
             char letterFromOne = one.charAt(i);
             char letterFromTwo = two.charAt(i);

             count [letterFromOne - 97] = count [letterFromOne - 97] + 1;
             count [letterFromTwo - 97] = count [letterFromTwo - 97] - 1;
        } return Arrays.equals(count, new int[26]);
    }
}
