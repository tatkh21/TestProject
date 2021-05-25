package replit_project.arrays1;

import java.util.Arrays;

public class InnerAndOuter {
    public static void main(String[] args) {
        int[] inner = {2, 4, 1, 6};
        int[] outer = {1, 2, 4, 6};
        int count = 0;


        for (int each : inner) {
            for (int l = 0; l < outer.length; l++) {
                if (Arrays.binarySearch(outer, each) >= 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println((count== inner.length));
    }
}
