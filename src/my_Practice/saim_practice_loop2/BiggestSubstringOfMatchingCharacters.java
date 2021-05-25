package my_Practice.saim_practice_loop2;

public class BiggestSubstringOfMatchingCharacters {
    public static void main(String[] args) {
        String word = "aannnkkkkeeeeee";
        String sameChar = "";
        String biggest = "";

        for (int i = 0; i < word.length()-1; i++) {
            sameChar += word.charAt(i);
            if (word.charAt(i) != word.charAt(i + 1) || i == word.length() - 2) {
                if (i == word.length() - 2 && word.charAt(i) == word.charAt(i + 1)){
                    sameChar += word.charAt(i + 1);
                }
                if (sameChar.length() > biggest.length()) {
                    biggest = sameChar;
                }
                sameChar = "";
                }
            }
        System.out.println("Longest substring: " + biggest);
        }
    }

