package day21_string_manipulation;

public class StringChar {
    public static void main(String[] args) {
        String name = "aziza";
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        int count = name.length();
        lastLetter = name.charAt(count - 1);
        System.out.println();
        System.out.println(name.indexOf("l"));//-1 if not found
        String word = "Hello";
        System.out.println(word.charAt(word.length()- 1));
        if (word.length() == 3 && name.length() == 3) {
            System.out.println("" + word.charAt(0) + name.charAt(0) + word.charAt(1) + name.charAt(1)
                    + word.charAt(2) + name.charAt(2));
        } else {
            System.out.println("Can not merge");

            if (name.length() == 5) {
                System.out.println("" + name.charAt(4) + name.charAt(3) + name.charAt(2) + name.charAt(1) + name.charAt(0));
            } else if (name.length() < 5) {
                System.out.println ("Too short!");
            } else {
                System.out.println("Too long!");
            }
        }
    }
}
