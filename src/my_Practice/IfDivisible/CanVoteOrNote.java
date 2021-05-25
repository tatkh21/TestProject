package my_Practice.IfDivisible;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CanVoteOrNote {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your age:");
        int age = scan.nextInt();
        int difference = 18 - age;
        if (age < 18) {
            System.out.println("You are not eligible to vote, come back in " + difference + " years.");
        } else {
            System.out.println("Welcome, you can vote.");
        }
    }
}
