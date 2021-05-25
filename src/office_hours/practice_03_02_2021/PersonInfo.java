package office_hours.practice_03_02_2021;
//
//    - String name
//            - byte age
//            - char gender
//            - boolean student
//            - short number of siblings
//            - long favorite number
//            - int number of seasons in your area
//            - double birth date: (month.day)
//            - int year
//            - String full birthday date with year
//            - String favorite quote
//
//            - Print the person information
//
//
//
//            - Challenge: print your name in a cool way (unicode)
//            - Challenge: char star

public class PersonInfo {
    public static void main (String[]args){
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;
        // Assiment of date
        name = "Tatyana";
        age = 50;
        gender = 'F';
        numberOfSiblings = 5;
        favoriteNumber = 7L;
        numberOfSeasons = 4;
        year = 2021;
        birthDate = 3.2;
        fullBirthDate = ""  + birthDate + "." + year;// 3.2.2021 we add "" to turn number to a string
        //fullBirthDate = ""  + birthDate + '.' + year;
        //fullBirthDate = birthDate + year + ""; // 2024.2 --. adds first thn turn it to the string
        favoriteQuote = "Have a good Mindset";

        System.out.println("Name:" + name);
        System.out.println ("");






    }


}
