package office_hours.practice_03_03_2021;
/*

Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old
 */

public class Age {
    public static void main (String[]args){
        int age = 20;
        int ageInDays = 365 * age;
        System.out.println("your age " + age + " years old!" +
                " That means you are  " + ageInDays + " days old.");





    }
}
