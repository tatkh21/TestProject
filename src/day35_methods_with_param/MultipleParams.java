package day35_methods_with_param;
import java.util.Scanner;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);
        showSum(5.5,3.3);
        int a = method4('s', "zebra");
        System.out.println(method4('z', "zebra"));
        int total = method5(1,3);














    }
    public static void showSum (double num1,double num2) {
        double sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
    public static int method4(char c,String s) {
    return 5;
    }
    public static int method5(int str,int str2) {
        return str * 2;
    }
}
