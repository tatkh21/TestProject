package my_Practice.scaner_practice1;
import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        Scanner scan = new Scanner(System.in);
        String subjectName1 = scan.next();
        double score1 = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String sujectName2 = scan.next();
        double score2 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subjectName3 = scan.next();
        double score3 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subjectName4 = scan.next();
        double score4 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectName5 = scan.next();
        double  score5 = scan.nextDouble();
        double avrgScore = (score1 + score2 + score3 + score4 + score5)/5;
        String summary = (subjectName1 + " - " + score1 + ", " + sujectName2 + " - " + score2 + ", " + subjectName3 +
                " - " + score3 + ", " + subjectName4 + " - " + score4 + ", " + subjectName5 + " - " + score5 );
        System.out.println("Summary: " + summary);
        System.out.println("Your average score is: " + avrgScore);
        System.out.println("Thank you for using Grader!\nGoodbye!");
    }
}


