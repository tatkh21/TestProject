package day18_conditional_practice_string_info;

public class RangeChecks {
    public static void main(String[] args) {
        int score = 50;

        if (score >= 90 || score <= 100) {
            System.out.println("score = " + score + " is A");;
        } else if ( score < 90 && score >= 61) {
            System.out.println("score = " + score + " is B");
        } else if ( score <=60 && score >= 41){
            System.out.println("score = " + score + " is C" );
        } else if ( score <= 40 && score >= 1) {
            System.out.println("score = " + score + " is D" );;
        } else {
            System.out.println("Invalid input");
        }
    }
}
