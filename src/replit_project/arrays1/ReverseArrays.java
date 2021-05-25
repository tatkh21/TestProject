package replit_project.arrays1;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 44, 1, 100, 55};
        int temp = 0;
        for (int i = 0, j = nums.length-1; i < nums.length/2; i++, j--) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
