package replit_project.arrays;

import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {
        int[] nums = {10, 40, 50, 3, 1};
        int[] nums1 = {11, 0, 500, 44, 1101};
        System.out.println(Arrays.toString(addAllElements(nums,nums1)));
    }
    public static int [] addAllElements(int[] num1, int[]num2) {
        int[] num3 = new int [num1.length];
        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i] + num2[i];
        }
        return num3;
    }

}
