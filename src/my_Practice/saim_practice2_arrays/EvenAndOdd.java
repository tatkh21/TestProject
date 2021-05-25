package my_Practice.saim_practice2_arrays;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[] nums = {1,2,-3,4,-34,55,78,90,33,10};
        String evenNums = "";
        String oddNums = "";
        for (int each : nums) {
            if (each % 2 == 0) {
                evenNums += each + ",";
            } if (each % 2 != 0) {
                oddNums += each + ",";
            }
        } String[] evenArr = evenNums.split(",");
        String[] oddArr = oddNums.split(",");
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

    }
}
