package my_Practice.saim_practice_arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] nums = {1, 34, 50, 43, 10, 11, 67, 30, 34, 2, 3 };
        int countEven = 0;
        int countOdd = 0;
        for (int each : nums) {
            if (each % 2 == 0) {
                countEven++;
            } if (each % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
    }
}
