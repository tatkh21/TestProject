package my_Practice.saim_practice_arrays;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int [] num = new int [100];
        for (int i = 0; i < 100; i++) {
            num[i] += i+1;
        }//System.out.println(Arrays.toString(num));
        for (int each: num) {
            System.out.println(each);
        }
    }
}
