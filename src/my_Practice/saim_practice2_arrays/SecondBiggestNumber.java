package my_Practice.saim_practice2_arrays;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,1,4,5,2,4,8,4,8,7};
        int biggestNumber = nums[0];
        int secondBiggest = nums[0];
        for (int each : nums) {
            if (each > biggestNumber){
                secondBiggest = biggestNumber;
                biggestNumber = each;
            } if (each > secondBiggest && each < biggestNumber) {
                secondBiggest = each;
            }
        }
        System.out.println("Biggest number is " + biggestNumber);
        System.out.println("Second biggest number is " + secondBiggest);

    }
}
