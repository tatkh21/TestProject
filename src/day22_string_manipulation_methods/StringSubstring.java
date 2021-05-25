package day22_string_manipulation_methods;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        System.out.println( word.substring(0,4)); // java
        System.out.println(word.substring(0,7)); // java is
        System.out.println(word.substring(5, 7));// is
        System.out.println(word.substring(8,11));// fun
        System.out.println(word.substring(8));
        System.out.println(word.substring(5));// is fun




    }
}
