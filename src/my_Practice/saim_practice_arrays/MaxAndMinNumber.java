package my_Practice.saim_practice_arrays;
import java.util.*;
public class MaxAndMinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] num = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int max = num[0];
        int min = num[0];
        for ( int each : num) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
    }


