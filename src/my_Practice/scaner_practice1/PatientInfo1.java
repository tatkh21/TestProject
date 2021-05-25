package my_Practice.scaner_practice1;
import java.util.Scanner;
public class PatientInfo1 {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information\nEnter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        String email;
        String street;
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you maried?");
        boolean isMarried = scan.nextBoolean();
        String contacts = "work phone number - " + workPhoneNumber +
                ", personal phone number - " + personalPhoneNumber +
                ", email: " + email;
        String fullName = firstName + " ," + lastName;
        String address = street + ", " + city + ", " + state +" " + zipcode;
        System.out.println("Patient personal information\nFull name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println ("Age: " + age);
        System.out.println("Height: " + height + "\nWeight: " + weight + " pounds" + "\nMaried?: " + isMarried);
}
    }