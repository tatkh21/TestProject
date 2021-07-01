package day40_array_list;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
       ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums.size());
       nums.add(5);
       nums.add(7);
       nums.add(11);
       nums.addAll(Arrays.asList(1,2,3));

        System.out.println("size = " + nums.size());

        //reading from array list
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        //System.out.println("index 3 = " + nums.get(3)); will return ERROR indexOutOfbound

        // print all values in the same line
        System.out.println(nums);//no need to convert it to string Arrays.toString(numArray)

        // remove items

        nums.remove(1);//reemove element at index 1
        System.out.println(nums);


    }

}
