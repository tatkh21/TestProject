package my_Practice.IfDivisible;

public class IfLeapYear {
    public static void main(String[]args){
        int year = 2020;
        int daysInYear = 360;
        if (daysInYear % 4 == 0) {
            System.out.println( year + " year is a leap year");
        } else if ((daysInYear % 4) != 0) {
            System.out.println(year + " year is not a leap year");
        } else {
            System.out.println("Wrong input please try one more time");
        }
    }
}
