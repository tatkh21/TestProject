package my_Practice.saim_practice2_arrays;

public class LongestPalindrom {
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        //String[] words = {"abc", "dna", "cvr", "kevin", "joe", "lamp"};
        String palindrome = "";
        String longestPalindrome = "";
        for (int j = 0; j < words.length; j++) {
            for (int i = 0 ; i < words[j].length()/2; i++ ) {
                if (words[j].charAt(i) == words[j].charAt(words[j].length()-1-i)) {
                    palindrome = words[j];
                    if (palindrome.length() > longestPalindrome.length()) {
                        longestPalindrome = palindrome;
                    }
                }
            }

        } if (palindrome.isEmpty()){
            System.out.println("No Palindrome");
        } else {
            System.out.println("Longest Palindrome is - " + longestPalindrome);
        }

            }
        }


