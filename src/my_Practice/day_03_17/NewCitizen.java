package my_Practice.day_03_17;
import java.util.Scanner;
public class NewCitizen {
    public static void main(String[] args) {
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        Scanner scan = new Scanner (System.in);
        int seniorCitizens = scan.nextInt();
        int nonSeniorCitizens = scan.nextInt();
        System.out.println ("What is new citizen's age?");
        int age = scan.nextInt();
        if (age >= 65){
            ++seniorCitizens;
            System.out.println("Senior Citizen");
        } else {
            ++nonSeniorCitizens;
            System.out.println ("Non-Senior Citizen");
        }
        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);

    }
}
