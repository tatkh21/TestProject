package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithReturn {
    public static void main(String[] args) {
        //1 second = 1 000 000 000 of a second
        System.out.println(System.nanoTime());
        long start = System.nanoTime();
        List<Integer> nums  = getIntegerList();//returns ready ArrayList object
        long end = System.nanoTime();
        double listSeconds = (end-start)/ 1_000_000_000.0;
        System.out.println("arrayList seconds = " + listSeconds );
        System.out.println("arrayList time =" + (end - start));//print duration

        long st = System.nanoTime();// start
        //System.out.println(nums);
        int[] numsArray = getIntegerArray();
        //System.out.println(numsArray);
        long en = System.nanoTime();//end
        double sseconds = (en - st)/ 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
    }
    /**
     * getIntegerList
     * return List<Integer
     * lop from 0-1000_000
     * and add
     */
    public static List<Integer> getIntegerList() {
        List<Integer> nams = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nams.add(i);
        }
            return nams;
    }
    public static int[] getIntegerArray() {
        int[] n = new int[1_000_001];
        for (int i = 0; i <= 1_000_00; i++) {
            n[i] = i;
        }
        return n;
    }
    /**
     * get
     */


}
