package my_Practice.saim_practice_loop1;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        int min = num;
        int max = num;
        for (int i = 0; i < 4; i++){
            System.out.println("Enter a number");
            int num1 = scan.nextInt();
            if (num1 > max){
                max = num1;
            } else if (num1 < min){
                min = num1;
            }
        }
        System.out.println("Maximum number is - " + max);
        System.out.println("Minimum nimber is - " + min);

    }
}
