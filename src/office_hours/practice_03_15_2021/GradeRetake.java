package office_hours.practice_03_15_2021;

public class GradeRetake {
    public static void main (String[]args) {
        int score = 98;
        int numberOfAttempts = 1;
        int retakePenalty = 0;

        if (numberOfAttempts == 1) {
            retakePenalty = (int)(score * .10);
        }if (numberOfAttempts == 2) {
            retakePenalty = (int) (score * .20);
        } if (numberOfAttempts == 3){
            retakePenalty = (int) (score * .30);
        }
        System.out.println("Grade after you retake attempt" + numberOfAttempts + "was" + (score - retakePenalty) );
    }
}
