package office_hours.practice_03_30_2021;
import java.util.Scanner;
/*
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Zora–z
- Descending:Z–Aorz–a
 */

public class DinamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lower");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = input.next();
        int starting;
        int ending;
        if(upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';

        } else {
            starting = 'a';
            ending = 'z';
        }
        for (int i = starting; i <= ending; i++) {
            System.out.print((char)i);
        }
        if (ascendingOrDescending.equals("ascending")){
            for (int i = starting; i >= ending; i--) {
                System.out.print((char)i + " ");
            }
        }
    }
}
