package day14_multi_branch_if_statments;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Enter any operator (+,-,*,/)");
        char operator = scan.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Ivalid operator");
        }
    }
}