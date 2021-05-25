package replit_project.arrays1;

import java.util.Arrays;

public class LeftShifted {
    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 3};
        int temp = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        } nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));

    }
}
