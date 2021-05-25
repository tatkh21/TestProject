package replit_project.arrays1;

public class Diving {
    public static void main(String[] args) {
        float[] score = {1,5,5,5,5,8,9};
        float difficulty = 2.1F;
        float min = score[0];
        float max = score[0];
        float sum = 0;
        for ( int i = 0; i < score.length; i++) {
            sum += score[i];
            if (score[i]< min) {
                min = score[i];
            }
            if (score[i] > max) {
                max = score[i];
            }
        }
        sum -= (max + min);
        sum *= difficulty;
        float total = sum * 0.6F;
        System.out.println("Total = " + total);
    }
}
