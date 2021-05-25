package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Houston";
        System.out.println(city.equals("Houston"));//true
        System.out.println(city.equals("houston"));//false
        System.out.println(city.equals("Houston "));//false
        //EQUALSIGNORECASE() method - CASE INSENSITIVE COMPARISON

        System.out.println(city.equalsIgnoreCase("Houston"));//true
        System.out.println(city.equalsIgnoreCase("HOUSTON"));//true
        System.out.println(city.equalsIgnoreCase("houston"));//true
        System.out.println(city.equalsIgnoreCase("Housston"));//false(characters are not matching)
        System.out.println(city.equalsIgnoreCase("Houst on"));//false(space is a different character)



        }

    }

