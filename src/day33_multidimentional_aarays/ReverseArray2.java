package day33_multidimentional_aarays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        int[] nums = {5, 10, 4, 100};
        System.out.println("Befor swap - " + Arrays.toString(nums));
        int temps = nums[0];
        nums[0] = nums[3];
        nums[3] = temps;
        temps = nums[1];
        nums[1] = nums[2];
        nums[2] = temps;
        System.out.println("After swap - " + Arrays.toString(nums));

        int[] nums2 =  {5, 10, 4, 100};
        System.out.println("Before: " + Arrays.toString(nums2));
        for ( int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1-i];
            nums2[nums2.length - 1-i] = temp2;
            System.out.println("After: " + Arrays.toString(nums2));

             //                0        1      2      3       4
            String[] words = {"java", "html", "js", "ruby", "css"};
            System.out.println("Before: " + Arrays.toString(words));
            //    k - 0;       j - 4
            for (int k= 0, j = words.length-1; k < words.length/2; k++, j--) {
                String tempWord = words[k];
                words[k] = words[j];
                words[j] = tempWord;
            } System.out.println("After reverse : " + Arrays.toString(words));


        }


    }
}
