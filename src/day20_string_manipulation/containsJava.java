package day20_string_manipulation;
import java.util.*;
public class containsJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.contains("java")) {
            if (word.startsWith("java")) {
                exists = true;
                System.out.println(exists);
            } else if (word.contains("java") && word.indexOf("java") == 1) {
                exists = true;
                System.out.println(exists);
            } else {
                exists = false;
                System.out.println(exists);
            }
        }
    }
}
