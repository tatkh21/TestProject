package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        Integer [] nums = {2, 4, 6, 1, 10, 3, 7, 34, 22};
        //print all nums in same line
        System.out.println(Arrays.toString(nums));
        //sort nums
        Arrays.sort(nums);
        // print sorted array
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length -1]);

        Arrays.sort(nums, Collections.reverseOrder());// this only work with object not with primitive

        String[] words = {"Java", "Python", "Ruby", "C++", "C#"} ;
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words)+ "]");
        // sort words in alphabetical order and ASCII
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        // sort in reverse order
        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
