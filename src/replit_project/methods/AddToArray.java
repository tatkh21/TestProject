package replit_project.methods;
import java.util.Arrays;
public class AddToArray {
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int[] newArr = new int [r.length + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = r[i];
        } newArr[newArr.length - 1] = n;
        System.out.print(Arrays.toString(newArr));

    }

    public static void main(String[] args) {

        int[] arr = {23,45,56,2,56,34};
        int n = 10;
        add_to_r(arr, n);

    }

}
