package day37_methods_overload;

public class DaySelector {
    public static void main(String[] args) {

        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        for (int i = 1; i < 9; i++) {
            System.out.println(i + " = " + getDayName(i));
            //Store getDayName into variable, and print variable
            String day = getDayName(1);
            System.out.println(day);
            String someDay = getDayName(0);
            if (someDay == null) {
                System.out.println("someDay is null for invalid day");
                System.out.println(getdayName2(2));
            }
        }
    }
    public static String getDayName (int day){
        switch (day) {
            case 1 :
                return "Monday";
            case 2:
                return "Tusday";
            case 3:
                return "Wensday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
               // return "not a valid input";
                System.out.println("Invalid day" + day);
                return null;//nothing no object




        }
    }
    public static String getdayName2 (int day) {
        String dayName;
        switch (day) {
            case 1: dayName = "Monday";
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            case 4: dayName = "Thursday";
                break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
                break;
                case 7: dayName = "Sunday";
                    break;
            default:
                System.out.println("Invalid day");
                dayName = null;
        }
        return dayName;

    }
}
