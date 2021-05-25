package office_hours.practice_04_06_2021;
import java.util.*;
/*
Generate a random number that is six digits long. Each digit in this number should be unique,
meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random
 */

public class Randome6GigitNumber {
    public static void main(String[] args) {
        Random randome = new Random();
        String randomeNumber = "";

        while (randomeNumber.length() != 6) {
            int eachRandome = randome.nextInt(10);
            //int eachrandome = randome.nextInt(9) + 1;
            if (!randomeNumber.contains("" + eachRandome)){
                randomeNumber += eachRandome;

            }
        }
        System.out.println("Randome Number: " + randomeNumber);

    }

}
