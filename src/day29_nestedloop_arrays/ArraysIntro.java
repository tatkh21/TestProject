package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;// single variable
        int [] nums = new int[3];// array variable
        nums [0] = 5;
        nums [1] = 7;
        nums [2] = 10;
        System.out.println(nums[0] + " - value at index 0");
        System.out.println(nums[1] + " - value at index 1");
        System.out.println(nums[2] + " - value at index 2");
        // we can use variables to spesify index number
        int i = 0;
        System.out.println(nums[i]);// 5
        i++;
        System.out.println(nums[i]);//7

        //how to find out the size of the array
        System.out.println("number of elements = " + nums.length);

        //store values of array in variebles
        int length = nums.length;
        System.out.println(length);

        nums[0] = 100;
        nums[1] = 300;
        nums [2] = nums[1];
        System.out.println(nums[0] + " - value at index 0");
        System.out.println(nums[1] + " - value at index 1");
        System.out.println(nums[2] + " - value at index 2");





    }
}
