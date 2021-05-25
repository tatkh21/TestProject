package my_Practice.IfDivisible;

public class gradeRetake {
    public static void main(String[]args) {
        int numberOfAtempts = 1;
        int grade = 90;
        int retakePenalty = 0;

        if (numberOfAtempts == 1) {
            retakePenalty = (int) (grade * .10);
        } else if (numberOfAtempts == 2) {
            retakePenalty = (int) (grade * .20);
        } else if (numberOfAtempts == 3) {
        retakePenalty = (int) (grade * .30);
        } else {
            System.out.println("Invalid number");
        }
        System.out.println("You had " + numberOfAtempts + " atempts and your final grade is " + (grade - retakePenalty));
    }
    }

