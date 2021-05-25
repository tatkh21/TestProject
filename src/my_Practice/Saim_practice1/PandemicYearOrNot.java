package my_Practice.Saim_practice1;
import java.util.Scanner;
public class PandemicYearOrNot {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to check if there was pandemic in that year:");
        int year = scan.nextInt();
        if (year >= 1346 && year <= 1353) {
            System.out.println(year + " - was Black Death pandemic ");
        } else if (year >= 1665 && year <= 1667) {
            System.out.println(year + " - was Great Plague of London");
        } else if (year >= 1770 && year <= 1772){
            System.out.println(year + " - was Russian Plague");
        } else if (year >= 1889 && year <= 1890){
            System.out.println(year + " - Flu Pandemic");
        } else if (year == 1960){
            System.out.println(year + " - American polio epidemic");
        } else if (year >= 1918 && year <= 1920){
            System.out.println(year + " - Spanish flue");
        } else if (year >= 2009 && year <= 2010) {
            System.out.println(year + " - H1N1 Swine Flue pandemic");
        } else if (year >= 2014 && year <= 2016) {
            System.out.println(year + " - West African Ebola epidemic");
        } else if (year >= 2020 && year <= 2021) {
            System.out.println(year + " - COVID-19");
        } else if (year <= 0 || year > 2021) {
            System.out.println("Invalid Year");
        } else {
            System.out.println("No pandemic");
        }

    }
}
