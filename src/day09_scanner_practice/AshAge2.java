package day09_scanner_practice;

import java.util.Scanner;

public class AshAge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();//could be any value assigned during program run
        System.out.println(age + " - that is a great age!");
        //scan.close(); optionally close the scanner


    }
}
