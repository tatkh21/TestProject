package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }
        String word = "Java";
        String uWord = word.toUpperCase();
        System.out.println(word);
        System.out.println(uWord);
    }
}

