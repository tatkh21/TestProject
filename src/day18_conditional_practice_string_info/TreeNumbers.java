package day18_conditional_practice_string_info;

public class TreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 440;
        int num3 = 1100;

        if (num1 <= num2 && num2 >= num3 ){
            System.out.println(num2 + " is the largest number ");
        } else if (num2 <= num1 && num1 >= num3) {
            System.out.println(num1 + " is the largest number");
        } else if (num1 <= num3 && num3 >= num2) {
            System.out.println(num3 + " is largest number" );
        }
    }
}
