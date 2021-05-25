package my_Practice.Saim_practice1;
import java.util.Scanner;

public class PersonalInfo_Scanner_If {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("How many people do you live with?");
        int numOfPeople = input.nextInt();
        if (numOfPeople == 0) {
            System.out.println(name + " lives alone ");
        } else if (numOfPeople == 1 ){
            System.out.println(name + " lives with " + numOfPeople + " person");
        } else if (numOfPeople > 1 ){
            System.out.println(name + " lives with " + numOfPeople + " people");
        }
        System.out.print("What city do you live in, " + name + " ?");
        String city = input.next();
        System.out.println("Do you live in downtown?");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String answer1 = input.next();
            if (answer1.equalsIgnoreCase("yes")){
                System.out.println("Do it, it is great!");
            } else {
                System.out.println("You should think about it");
            }
        } else {
            System.out.println("I hope you like your neighborhood");
        }
        System.out.println("What is your favorite animal");
        String animal = input.next();
        System.out.println("Wow, " + animal + " is a great animal!");
        System.out.println("How many pets do you want?");
        int numOfPets = input.nextInt();
        if (numOfPets == 0){
            System.out.println("You should think about it, pets are fun!");
        } else if (numOfPets <= 1){
            System.out.println("Interesting, do you want " + numOfPets + " " + animal + "?");
        }


    }
}
