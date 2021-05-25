package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        String word = null;
        System.out.println(word.toUpperCase());
        System.out.println("IsNullOrEmpty = " + isNullOrEmpty(word));
        word = "";
        System.out.println("(isNullOrEmpty()) = " + (isNullOrEmpty(word)));
    }
    public static boolean isPalindrom (String str) {
        str = str.toLowerCase();
        for (int i = 0; i <str.length()/2; i++ ) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
             return false;
            }
        }

       return true;
    }
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.isEmpty());
    }
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        } return reversed;
    }
}
