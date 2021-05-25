package my_Practice.scaner_practice1;
import java.util.Scanner;

public class Time {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();
        int hours = inputSeconds / 3600;
        System.out.println(inputSeconds + " seconds = " + hours + " hours");
        int minutes = (inputSeconds % 3600)/60;
        System.out.println(" minutes = " + minutes);
        int seconds = (inputSeconds % 3600) % 60;
        System.out.println("seconds = " + seconds);
                
    }
}
