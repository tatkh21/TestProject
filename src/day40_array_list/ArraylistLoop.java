package day40_array_list;
import java.util.*;

public class ArraylistLoop {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();//Polimorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(34); nums.add(345); nums.add(342); nums.add(344);
        nums.add(314); nums.add(3); nums.add(4); nums.add(39); nums.add(12);
        nums.add(314); nums.add(3); nums.add(4); nums.add(39); nums.add(12);

        System.out.println("nums = " + nums);
        nums.remove(1);//removes index
        nums.remove(0);
        System.out.println("nums = " + nums);

       // nums.remove(345) -> ERROR - Index out of bond exeption

        nums.remove(new Integer(345));// removes actual number
        nums.remove(new Integer(3));
        System.out.println("nums = " + nums);

        //
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
            //for each loop, and print all in same line
            for(int each:nums) {
                System.out.print(each + " ");
            }







    }
}
