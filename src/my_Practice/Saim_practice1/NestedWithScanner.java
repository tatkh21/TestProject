package my_Practice.Saim_practice1;

import java.util.Scanner;

public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Enter a single word");
            String word = input.next();

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }

        } else {

            System.out.println("enter a character");
            char letter = input.next().charAt(0);
             if (letter >= 'A' && letter <= 'Z') { // if (letter >= 65 && letter <= 90)
                 System.out.println(letter + " is upper case");
             } else if (letter >= 'a' && letter <= 'z') {//(letter >= 97 && letter <= 122)
                 System.out.println(letter + " + is a lower case letter");
             } else {
                 System.out.println("not a valid letter");
             }




        }
    }





}
