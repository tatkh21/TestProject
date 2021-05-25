package replit_project.loops;
import java.util.Scanner;

public class PartyNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestList = "Guest's list: ";
        String answer = "";
        do {
            System.out.println("Please enter guest name:");
            String name = input.next();
            guestList+= name + ", ";
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();

        } while (answer.equals("yes"));
        guestList = guestList.substring(0, guestList.lastIndexOf(", "));
        System.out.println(guestList);
  }
}
