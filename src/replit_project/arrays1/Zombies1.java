package replit_project.arrays1;

import java.util.Arrays;

public class Zombies1 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        int count = 0;
        int sum = 0;
        do {
            sum = 0;
            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
            for (int i = 0 ; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i]/2;
                sum += inhabitants[i];
            } count++;
        } while (sum!= 0);

        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
        System.out.println("----EXTINCT----");


    }

}
