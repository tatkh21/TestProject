package day14_multi_branch_if_statments;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 300;
        double num2 = 100;
        char operator = '*';
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