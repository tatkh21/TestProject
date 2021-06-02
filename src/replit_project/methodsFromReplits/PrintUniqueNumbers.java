package replit_project.methodsFromReplits;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNumbers(nums);

    }
    public static void printUniqueNumbers(int[] nums){
        int count = 0;
        for (int i = 0 ; i < nums.length; i++) {
            for (int j = 0 ; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            } if (count == 1) {
                System.out.println(nums[i]);
            } count = 0;
        }

    }
}
