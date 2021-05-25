package day18_conditional_practice_string_info;

public class FizzBuzz {
    public static void main(String[] args) {

        int num1 = 300;

        if ( num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num1 % 3 == 0) {
            System.out.println("Fizz");
        } else if (num1 % 5 == 0 ) {
            System.out.println("Buzz");
        } else {
            System.out.println(num1);
        }
    }
}
