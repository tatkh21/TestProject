package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[]args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;//same like hourlyRate = 50.0
        double monthlyPay = weeklyPay * 52/12;
        double anualPay = monthlyPay * 12;


        System.out.println("Weekly pay :" + weeklyPay);
        System.out.println("Monthly pay :" + monthlyPay);
        System.out.println("Anual pay:" + anualPay);





    }
}
