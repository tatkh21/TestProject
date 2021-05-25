package office_hours.practice_04_06_2021;
/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
 */
public class LongestSubstring {
    public static void main (String[]args) {
        String str = "aaabbcccc";
        String longestSubstring = "";
        String temp = "";

        for (int i = 0; i < str.length() - 1; i++) {
            temp += str.charAt(i);   ///aaa
            if (i == str.length()-2) {

                temp += str.charAt(i+1);
            }
            if (str.charAt(i) != str.charAt(i + 1)|| i == str.length()-2) {
                if (temp.length() > longestSubstring.length()){
                    longestSubstring = temp;///aaa
                }
                temp = "";
            }
        }
        System.out.println("longest substring "+ longestSubstring);

    }
}
