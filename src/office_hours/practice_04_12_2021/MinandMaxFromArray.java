package office_hours.practice_04_12_2021;

public class MinandMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 3, -10, 100, 45, 37};
        int min = arr[0];
        int max = arr[0];
        for (int each : arr) {
            //each-> every element |for loop [i]
            if (each < min) {
                min = each;
            }
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
