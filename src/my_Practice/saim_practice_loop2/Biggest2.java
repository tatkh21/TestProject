package my_Practice.saim_practice_loop2;

public class Biggest2 {

    public static void main(String[] args) {
        String word = "aabbbcckkkk";
        int max = 0;
        int count = 1;
        char maxChar = ' ';

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                    maxChar = word.charAt(i - 1);
                }
                count = 1;
            }
        }
        if (max < count) {
            max = count;
            maxChar = word.charAt(word.length() - 1);
        }

        for (int i = 0; i < max; i++) {
            System.out.print(maxChar);
        }

    }
    }
