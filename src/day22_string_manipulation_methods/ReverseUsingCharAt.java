package day22_string_manipulation_methods;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        String halfWord = word.substring(0, word.length()/2);//An
        System.out.println(halfWord.concat(halfWord));//AnAn
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        String reverseWord = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("reverseWord = " + reverseWord);

        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println("It is a palindrome word");
        } else {
            System.out.println("Not a palindrome word");
        }
    }
}
