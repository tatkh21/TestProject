package my_Practice.IfDivisible;
import java.util.Scanner;
/*
Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */
public class IfEven {
    public static void main (String[]args){
        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Number is even");
        } else if (num % 3 == 0){
            System.out.println("Number is devisible by 3");
        } else if (num % 5 == 0){
            System.out.println("Number is devisible by 5");
        } else {
            System.out.println("Number is odd");
        }
    }
}
