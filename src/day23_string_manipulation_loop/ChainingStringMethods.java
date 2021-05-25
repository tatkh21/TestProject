package day23_string_manipulation_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";
        System.out.println(word.toUpperCase().toLowerCase().length());
        // remove spaces and upper case
        System.out.println(word.replace(" ", "").toUpperCase());

        String word2 = "istamBul";
        System.out.println(word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase());
        String capitalized = word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase();

    }

}
