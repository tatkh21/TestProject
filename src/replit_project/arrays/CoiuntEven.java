package replit_project.arrays;

public class CoiuntEven {
    public static void main(String[] args) {


        int[] nums = {1, 8, 29, 1, 10};

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);

    }
}
