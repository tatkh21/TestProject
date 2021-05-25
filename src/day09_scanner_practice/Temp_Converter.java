package day09_scanner_practice;
import java.util.Scanner;
public class Temp_Converter {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("****** TEMPERATURE CONVERTER ********");
        System.out.println("Enter your temperature in F:");
        double tempInFarenfeits = scan.nextDouble();
        double tempInCelcius = (tempInFarenfeits -32)*5/9;
        System.out.println("Your temperature in Celcius -" + (int)tempInCelcius);
    }
}
