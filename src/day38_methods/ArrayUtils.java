package day38_methods;

import java.util.Arrays;

public class ArrayUtils {

    public static boolean ifContains(int[]nums, int num) {
        for (int each : nums) {
            if (each == num) {
                return true;
            }
        }return false;
    }

    public static int sum(int[] nums){
        int numSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numSum += nums[i];
        }
        return numSum;
    }

    public static void printArray(int[] nums)  {
       for (int each : nums) {
           System.out.print(each + " ");
       }
        System.out.println();
    }
}
