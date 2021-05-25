package day37_methods_overload;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum(10,5);
        sum(10.4,3.6);
        sum(4,2,3);
        sum("Hello", "world");

    }
    public static void  sum (int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void  sum (int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2, int3)");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void  sum (double num1, double num2) {
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void  sum (String str1, String str2) {
        System.out.println("sum(string, string)");
        System.out.println("Result = " + str1 + str2 );
    }
}
