package day41_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(120); nums.add(25);nums.add(23);
        System.out.println("before sort = " + nums);

        Collections.sort(nums);
        System.out.println("after sorting = " + nums);

    }
}
