package office_hours.practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        //number % 10 -> always give the last digit
        System.out.println(isPalindrom(123432189));

    }
    public static boolean isPalindrom(int number) {
        //System.out.println("last digit " + number % 10);
//        while (number != 0) {
//            number /= 10;// number = number/10
//            System.out.println("number after / 10 " + number);
//            System.out.println();
//        }
        int reverse = 0;
        int temp = number;
        while (temp!= 0) {
            int lastDigit = temp % 10 ;//1
            reverse = (reverse* 10) + lastDigit ;
            temp /= 10;


        }
        return reverse == number ;
    }
}
