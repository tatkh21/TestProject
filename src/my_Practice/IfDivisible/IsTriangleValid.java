package my_Practice.IfDivisible;
import java.util.Scanner;

public class IsTriangleValid {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 angles to check if triangle is valid");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double sum = num1 + num2 + num3;
        if (sum == 180) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not valid triangle");
        }


        }
    }

