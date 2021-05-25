package my_Practice.Saim_practice1;

public class OfficeHoursSchedule {
    public static void main(String[] args) {
        String day = "Saturday";
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
                System.out.println("On " + day + " Office hours at 4:30 - 5:45");
                break;
            case "Thursday":
                System.out.println("On " + day + " soft skill day");
                break;
            case "Friday":
                System.out.println(day + " is Day off");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(day + " already a long day, no office hours");
                break;
            default:
                System.out.println("Invalid day given");

        }
    }
}
