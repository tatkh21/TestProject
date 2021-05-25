package replit_project.methods;

import java.util.Scanner;
public class Fibonachi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE

        int[] fibonNums = new int [20];
        fibonNums[0] = 0;
        fibonNums[1] = 1;
        for (int i = 2; i < fibonNums.length; i++) {
            fibonNums[i] = fibonNums[i-2] + fibonNums[i-1];
        }
        System.out.println(fibonNums[num]);

    }
}
