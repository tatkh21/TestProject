package day12_conditional_statment;

public class CompareChars {
    public static void main (String[]args){
        char letter1 = 't';
        char letter2 = 'y';
        boolean compareLetters = letter1 > letter2;
        System.out.println(compareLetters);
        compareLetters = letter1 < letter2;
        System.out.println(compareLetters);
        System.out.println(letter1 == letter2);
        System.out.println(letter2 > letter1);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam?" + pass);
    }
}
