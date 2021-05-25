package office_hours.practice_04_06_2021;

public class Polindrome {
    public static void main(String[] args) {
        String word = "anoonna";
        boolean isPalindrome = true;
        // What if your String has a million characters
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;

            }
        }
        System.out.println(isPalindrome);

    }
}
