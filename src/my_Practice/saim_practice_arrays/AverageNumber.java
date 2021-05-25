package my_Practice.saim_practice_arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int[] num = {10, 15, 5, 6};
        int sum = 0;
        int average = 0;
        for (int each : num) {
           sum += each; 

        } average = sum/num.length;
        System.out.println("average = " + average);
    }
}
