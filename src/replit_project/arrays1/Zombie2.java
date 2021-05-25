package replit_project.arrays1;

import java.util.Arrays;

public class Zombie2 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int count = 0;
        int sum = 0;
        do {
            sum = 0;
            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length ; i++) {
                if (i == 0 && inhabitants[i] == 0) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
                }
                if (i == inhabitants.length - 1 && inhabitants[i] == 0) {
                    inhabitants[i - 1] = inhabitants[i - 1] / 2;
                }
                    if (inhabitants[i] == 0) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                    sum += inhabitants[i];
                }
                count++;
            }
            while (sum != 0) ;

            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
            System.out.println("---- EXTINCT ----");

        }
    }
