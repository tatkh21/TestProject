package day09_scanner_practice;


import java.util.Scanner;

/*
Enter miles:
10
10 miles in kilometer: 16.093
formula:
kilometers -> miles * 1.609
 */
public class Miles2KmConverter {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("############ MILES TO KM ############");
        System.out.println("Enter miles:");
        double miles = scan.nextDouble();
        double kilometres = miles * 1.609;
        System.out.println(miles + " miles in kilometres = " + kilometres );


    }
}
