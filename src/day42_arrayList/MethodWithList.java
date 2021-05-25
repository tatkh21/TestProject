package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        /**
         * methodName: printStringList
         * param:list of Strings
         * return;void
         * prints all values separated by space in same line
         */
        List <String> words = new ArrayList<>();
        words.add ("java"); words.add("html"); words.add("selenium");words.add("a");
        words.add("input");words.add("href");
        printStringList(words);
        printStringList(Arrays.asList("select","option","br","python", "sql","api"));
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,4,56,2,89,34));
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }
    public static void printStringList(List<String> strings) {
        for (String word: strings) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    /**
     * method:sumIntegerList
     * param:list Of Integers
     * returns int
     * calculate sum of int in the list then returns
     */
    public static Integer sumIntegerList(List<Integer> nums) {
        int sum = 0;
        for (Integer num : nums){
            sum += num;
        } return sum;
    }
}
