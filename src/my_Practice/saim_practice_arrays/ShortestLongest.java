package my_Practice.saim_practice_arrays;

public class ShortestLongest {
    public static void main(String[] args) {
        String[] words = {"Spring", "is", "a", "beautiful", "season"} ;
        String longestWord = words[0];
        String shortestWord = words[0];
        for (String each: words) {
            if (each.length() > longestWord.length()) {
                longestWord = each;
            } if (each.length() < shortestWord.length()) {
                shortestWord = each;
            }
        }
        System.out.println("shortestWord = " + shortestWord);
        System.out.println("longestWord = " + longestWord);
    }
}
