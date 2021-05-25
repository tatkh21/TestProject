package my_Practice.saim_practice_loop1;

public class DivisibleBy3and5 {
    public static void main(String[] args) {

        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0 && num % 5 == 0 && num % 2 == 0) {
                System.out.println(num + " is even number divisible by 3 and 5");
            }
        }
        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0 && num % 5 == 0 && num % 2 == 1) {
                System.out.println(num + " is odd number divisible by 3 and 5");

            }
        }
    }
}
