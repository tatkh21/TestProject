package day38_methods;
//import all static methods. so that you can just call by method name, without classname
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Username cannot be null or empty");
        }
        System.out.println("is Palindrome (civic) = " + StringUtils.isPalindrom("civic"));
        System.out.println("is Palindrrom (kayak) = " + StringUtils.isPalindrom("kayak"));
        System.out.println("is Palindrom (cybertek) = " + isPalindrom("cybertek"));

        String word = "sunday";
        String reverseWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("reverseWord = " + reverseWord);


    }
}
