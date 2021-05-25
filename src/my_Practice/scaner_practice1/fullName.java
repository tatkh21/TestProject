package my_Practice.scaner_practice1;
import java.util.Scanner;
public class fullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();// very important if you enter more then 1 word

        if (fullName.equalsIgnoreCase("max payne") || fullName.equalsIgnoreCase("alan wake")) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }
    }
}
