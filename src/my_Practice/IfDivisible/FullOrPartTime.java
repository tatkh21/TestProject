package my_Practice.IfDivisible;
import java.util.Scanner;
public class FullOrPartTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your anual salary amount:");
        double anualSalary = scan.nextDouble();
        System.out.println("Are you a full time eployee? Enter true or false");
        boolean isFullTime = scan.nextBoolean();
        if (isFullTime) {
            System.out.println("As a full time employee your anual salary is " + (anualSalary + 20000) );
        } else {
            System.out.println("As a part time employee your anual salary is " + (anualSalary - 5000));
        }


    }
}
