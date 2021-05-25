package replit_project.methods;

import java.util.Arrays;

public class Switch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(do_switch(arr)));
    }
    public static int[] do_switch(int[] i) {
                int temp = 0;
                temp = i[0];
                i[0] = i[i.length-1];
                i[i.length-1] = temp;


        return i;
    }



}
