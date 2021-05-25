package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println ("" + word.charAt(word.length()/2 - 1)+word.charAt(word.length()/2));
        System.out.println(word.concat(word.concat(word)));


        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char four = company.charAt(3);
        char five = company.charAt(4);
        char six = company.charAt(5);
        char seven = company.charAt(6);
        char eight = company.charAt(7);
        System.out.println(first + " " + second + " " + third + " " + four + " " +
                five + " " + six + " " + seven + " " + eight);

        String word1 = "mom";
        char first1 = word1.charAt(0);
        char last = word1.charAt(2);
        if (first1 == last){
            System.out.println("first and last letters are matching");
        } else {
            System.out.println("first and last letters are not matching");
        }

        if (word1.charAt(0)==word1.charAt(2)) {
            System.out.println("first and last letters are matching");
        }




    }
}
