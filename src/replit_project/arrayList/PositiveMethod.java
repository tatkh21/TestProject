package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, -4, 6, 7, 9, -4, 0));
        System.out.println(appendPosSum(list));

    }

    public static List<Integer> appendPosSum(List<Integer> nums) {
        List<Integer> positiveNums = new ArrayList();
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                positiveNums.add(nums.get(i));
                sum += nums.get(i);
            }
        }
            positiveNums.add(sum);
            return positiveNums;

    }
}
