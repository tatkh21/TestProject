package office_hours.practice_03_02_2021;
/*

- For this one, pick which datatype you think is best for each variable
    - name, founded date, starting time, closing time, open on holidays, has aquarium section,
    number of big cats, number of hoofed animals, number of reptiles, number of birds, number of primates,
    number of employees, ticket cost for adults, ticket cost for under 13, park rules,
    - Make a brochure of the zoo's information.


 */

public class Zoo {
    public static void main (String[]args){
        String zooName = "HOUSTON ZOO", city = "Houston";
        int zooSize = 55;
        double foundedDate = 09.01;
        int yearFound = 1992;
        String startingTime = "9:00 a.m";
        String closingTime = "5:00 p.m";
        boolean openOnHolidays = true;
        short daysOpenYearly = 363;
        boolean hasAquariumsection = true;
        int numOfBigCats = 300, totalAnimals = 6000;
        int numberOfReptiles = 400;
        int numberOfBirds = 1000;
        int numberOfPrimates = 1000;
        int numberOfEmployees = 560;
        int numberOfHoofedAnimals = 200;
        double ticket4Adults = 29.95;
        double ticket4under13 = 25.95;
        String zooRules = "* Please stay on a visitor path\n*Please do not feed or touch the animals\n" +
                "*Please do not throw things at animals\n*Please do not pick up flowers plants.";
        System.out.println("");
        System.out.println("************************WELCOME TO HOUSTON ZOO***********************" );
        System.out.println("Servind as a " + zooSize + "-acre oasis in the heart of " + city +
                " we are welcoming you \nto " + zooName + ". The Zoo was found in " + foundedDate + "." +
                yearFound + " and there are " + totalAnimals + " animals.");
        System.out.println("There are more than " + numOfBigCats +  " big cats, " + numberOfReptiles + " reptiles, " +
                numberOfBirds + " birds, " + numberOfPrimates + " primates \nand " + numberOfHoofedAnimals +
                " hoofed animals. " + zooName + " is open " + daysOpenYearly + " days a year.\n Working hours are: " +
                startingTime + " to " + closingTime + ".");
        System.out.println( zooName + " open on holidays: " + openOnHolidays);
        System.out.println(zooName + " has aquarium : " + hasAquariumsection);
        System.out.println("----------------------------Tickets price------------------------------");
        System.out.println("\t\t\tADULT - $" + ticket4Adults + "\t\t\t\tCHILD(ages 3-12) - $" + ticket4under13);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\tOUR RULES");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println( zooRules);








    }


}
