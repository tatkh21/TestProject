package day36_methods;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        double sum = add(1,3);
        System.out.println("sum = " + sum);
        System.out.println("100 + 200 = " + add(100,200));

        System.out.println(subtract(10,3));
        System.out.println("100 - 50 = " + subtract(100,50));

        System.out.println(multiply(10,60));

        System.out.println(divide(300,10));

    }
    public static double add (double num1, double num2) {
        double sum = num1 + num2;
        return sum;//return num1 + num2;
    }
    public static double subtract (double num1, double num2) {
        double subtract = num1 - num2;
        return subtract ;//return num1 + num2;
    }
    public static double multiply (double num1, double num2) {
        double multiply = num1 * num2;
        return multiply;//return num1 + num2;
    }
    public static double divide (double num1, double num2) {
        double result = num1/num2;
        return result;
    }

}
