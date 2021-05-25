package day38_methods;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] nums = {1,2,5,4,78,65,4};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[] {23,45,67,2,56,45,67,89} );

        System.out.println("numsSum = " + ArrayUtils.sum(nums));
        System.out.println("numsSum = " + ArrayUtils.sum(new int[] {23,45,67,2,56,45,67,89}));

        int num = 100;

        System.out.println("Does array contains " + num + " = " + ArrayUtils.ifContains(nums,num));

    }
}
