package replit_project.arrays;

import java.util.Arrays;

public class MergeR {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4};
        int[]arr2 = {4,5,6};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));


    }
    public static int[] mergeArrays (int[] arr1, int[] arr2) {
        int [] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++ ) {
            if ( i < arr1. length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        } return arr3;
    }
}
