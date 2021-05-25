package my_Practice.scaner_practice;
import java.util.Scanner;
public class scaner_hello {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your name :");
        String firstname = scan.next();
        System.out.println ("Nice to meet you " + firstname);
        Scanner input = new Scanner(System.in);
        System.out.println ("Where are you from?");
        String country = scan.next();
        System.out.println (country + " is very beautiful country!");
        Scanner color = new Scanner (System.in);
        System.out.println ("What is your favorite colour?");
        String favoriteColor = scan.next();
        System.out.println (favoriteColor + " is a lovely colour!");

    }

}
