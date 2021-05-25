package replit_project.arrays;
import java.util.*;
public class NewArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        String newArray1 = "";

        int[] newArray = new int[nums.length * 2];
        newArray[newArray.length-1] = nums [nums.length-1];
        for (int i = 0; i < newArray.length; i++){

            newArray1 += newArray[i] + ", ";

        }
        newArray1 = newArray1.substring(0, newArray1.lastIndexOf(","));
        System.out.print("[" + newArray1 + "]");
        System.out.println("length = " + newArray.length);
        //System.out.println(newArray[]);
    }

}
