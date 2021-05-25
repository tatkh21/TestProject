package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter rent and month:");
        double rent = scan.nextDouble();
          scan.nextLine();//fix the bug.WORK-AROUND
        String month = scan.nextLine();
        System.out.println("Enter day ofthe week and momth:");
        String day = scan.nextLine();
        String month1 = scan.next();
        System.out.println("have a great day");

        System.out.println("rent = " + rent);
       System.out.println("month = " + month);

        //System.out.println("5 + 2 = " + (3 + 4);
       // System.out.println(3700%60);
    }
}
