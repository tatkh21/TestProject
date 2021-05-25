package day20_string_manipulation;
import java.util.*;
public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int firstIndex = email.indexOf("_");
        int secondIndex = email.indexOf("@");
        int thirdIndex = email.indexOf(".");
        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, firstIndex).toLowerCase();
        String lastName = email.substring(firstIndex + 1, firstIndex + 2).toUpperCase() +
                email.substring(firstIndex + 2, secondIndex).toLowerCase();

        String domain = email.substring(secondIndex + 1, thirdIndex);
        System.out.println("firstName = " + firstName);
        System.out.println("last_name = " + lastName);
        System.out.println("domain = " + domain);

    }
}
