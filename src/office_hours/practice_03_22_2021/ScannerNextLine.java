package office_hours.practice_03_22_2021;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // next()-> read a String value from console it only reads a single word
        // nextln()-> read a String value from console reads many words. Also accepts enter input.
        //

        System.out.println("Enter your name");

        String name = input.nextLine();
        System.out.println("Enter a number");
        int number = input.nextInt();

        System.out.println("Enter a word");
        input.nextLine();
        String word = input.nextLine();
        String word2 = input.nextLine();
        System.out.println(number);
        System.out.println(name);



    }

}
