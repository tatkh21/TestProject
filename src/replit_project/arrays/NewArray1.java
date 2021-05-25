package replit_project.arrays;
import java.util.*;

public class NewArray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();

            }if ( size > 1) {
            System.out.println(num [0]);
            System.out.println(num[1]);
        } else if (size < 1){
            System.out.println(num [0]);
        };


    }
}
