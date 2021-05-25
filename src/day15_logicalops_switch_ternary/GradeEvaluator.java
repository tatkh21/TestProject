package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class GradeEvaluator {
    public static void main (String[]args){
        System.out.println("Enter your grade");
        Scanner scan = new Scanner(System.in);
        char grade = scan.next().charAt(0);
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("Passed with grade " + grade);
        } else if ( grade == 'D'){
            System.out.println("Qualify for retake with grade " + grade);
        } else if (grade == 'E'){
            System.out.println("You failed with grade " + grade);
        }else {
            System.out.println("You entered invalid grade");
        }

        if ((grade == 'A' ||grade == 'a')||(  grade == 'b' || grade == 'B') || ( grade == 'c' || grade == 'C')){
            System.out.println("Passed with grade " + grade);
        } else if ( grade == 'D'){
            System.out.println("Qualify for retake with grade " + grade);
        } else if (grade == 'E'){
            System.out.println("You failed with grade " + grade);
        }else {
            System.out.println("You entered invalid grade");
        }
    }
}
