package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("j"));//false

        if (company.contains(" ")) {
            System.out.println("Multiple words company name");
        } else {
            System.out.println("Single word company name");
        }
        String etsyTitle = ("Wooden spoon | Etsy");

        if (etsyTitle.contains(" | ")) {
            System.out.println("title check passed");
        } else {
            System.out.println("Title check not passed");
        }
        String firstName = "Ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("Both \"a\" and \"e\" are present");
        } else {
            System.out.println("\"a\" and \"e\" are not present");
            firstName = "Nadir";
            if (firstName.contains("a") || firstName.contains("r")) {
                System.out.println("a or e are present");
            } else {
                System.out.println("");
            }

            String email = "tatkh21@gmail.com";
            if (email.contains("@") && email.endsWith(".com")) {
                System.out.println("Valid email");
            } else {
                System.out.println("invalid email");
            }
            if (email.toLowerCase().contains("d")) {
                System.out.println("d is present");
            } else {
                System.out.println("d is not present");
            }
            String fullName = "max payne";
            if (fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")) {
                System.out.println("User found!");
            } else {
                System.out.println("User not found!");


            }


        }
    }
}