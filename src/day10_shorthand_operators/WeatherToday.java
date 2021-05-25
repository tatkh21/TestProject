package day10_shorthand_operators;
import java.util.Scanner;
/*weather -> sunny, raining, very cold, very hot
import scanner
create scanner object
ask a question:
How is the weather today?
"cold"
cold - is a nice day today!

 */
public class WeatherToday {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();
        System.out.println (weather + " - is a nice day today!");
    }
}
