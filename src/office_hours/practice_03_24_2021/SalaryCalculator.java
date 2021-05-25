package office_hours.practice_03_24_2021;

public class SalaryCalculator {
    public static void main (String[]args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeek = 52;
        boolean hourlyRateIsValid = hourlyRate >0;
        boolean weeklyHoursAreValid = weeklyHours > 1 && weeklyHours < 65;
        boolean numberOfWeeksAreValid = numberOfWeek > 1 && numberOfWeek < 52;

        if (hourlyRateIsValid) {
            if (weeklyHoursAreValid){
                if (numberOfWeeksAreValid){
                    System.out.println("salary is : " + hourlyRate * weeklyHours * numberOfWeek);

                } else {
                    System.out.println("Number of Weeks cannot be less than 1 and more than 52");
                }
            } else {
                System.out.println("Weekly hours cannot be less than 1 and more than 65");
            }
        } else {
            System.out.println("Hourly Rate cannotbe Negative or zero");
        }
        // option 2

        if (hourlyRateIsValid && weeklyHoursAreValid && numberOfWeeksAreValid) {
            System.out.println("salary is : " + hourlyRate * weeklyHours * numberOfWeek);
        } else {
            if (!hourlyRateIsValid) {
                System.out.println("Hourly Rate cannotbe Negative or zero");
            } else if (!weeklyHoursAreValid) {
                System.out.println("Weekly hours cannot be less than 1 and more than 52");
            } else {
                System.out.println("Number of Weeks cannot be less than 1 and more than 52");
            }
        }

    }
}
