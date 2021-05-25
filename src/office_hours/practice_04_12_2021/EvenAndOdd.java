package office_hours.practice_04_12_2021;
import java.util.Scanner;
import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        //int[] nums = {30, 3, 1, 48, 90, 91, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want?");
        int[] nums = new int[input.nextInt()];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i+1));
            nums[i] = input.nextInt();
        }
        // We are counting the number of even and odd values from that array
        int even = 0;
        int odd = 0;
        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        // Used the counters of even and odd to make new arrays to store the values
        int[] evenNumber = new int[even];
        int[] oddNumber = new int[odd];
        // Here we go through ever element, checks if its even or odd.
        // Then it will store the number into the even or odd array
        // This storage is based on the e and o variables

        // i -> keep track of indexes in nums array
        // e -> keep track of indexes in our evenNumbers array
        // o -> keep track of indexes in our oddNumbers array

        for (int i = 0, e = 0, o = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNumber[e++] = nums[i];
            } else {
                oddNumber[o++] = nums[i];
            }
            System.out.println("odd = " + odd);
            System.out.println("even = " + even);
        }
        System.out.println(Arrays.toString(evenNumber));
        System.out.println(Arrays.toString(oddNumber));
    }
}
