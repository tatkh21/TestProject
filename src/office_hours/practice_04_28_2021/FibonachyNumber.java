package office_hours.practice_04_28_2021;

import java.util.Arrays;

public class FibonachyNumber {
    public static void main(String[] args) {
        fib(10);

    }
    public static void fib (int num) {
        int[] arr = new int [num + 1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
