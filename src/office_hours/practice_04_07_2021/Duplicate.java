package office_hours.practice_04_07_2021;
/*
Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.
Ex: AAABCCDEEF Output:
ACE
 */
public class Duplicate {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String cheked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (cheked.contains("" + str.charAt(i))){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            } if (count > 1) {
                System.out.println(str.charAt(i) + "is duplicate");
            } cheked += str.charAt(i);
        }
    }
}
