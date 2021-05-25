package my_Practice.saim_practice2_arrays;

import java.util.Arrays;

public class Gradebook {
    public static void main(String[] args) {
        String[] students = {"Julia", "Nick", "Anna", "Leo", "Anastasia", "George"};
        int[] score = {87, 67, 90, 65, 79, 78 };
        char[] grade = new char [6];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 85 && grade[i] <= 100) {
                grade[i] = 'A';
            } else if (score[i] > 75 && score[i] <= 85 ) {
                grade[i] = 'B';
            } else if (score[i] > 65 && score[i] <= 75 ) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
            System.out.println(students[i] + "'s score is " + score[i] + " - grade " + grade[i]);
        }

    }
}
