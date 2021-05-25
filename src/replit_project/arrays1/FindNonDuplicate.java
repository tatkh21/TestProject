package replit_project.arrays1;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        int countDuplicate = 0;
        int notDuplicate = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    countDuplicate++;
                }
            }if (countDuplicate > 1) {
                countDuplicate = 0;
            } else {
                notDuplicate = nums[i];
            }
        }
        System.out.println(notDuplicate);

    }
}
