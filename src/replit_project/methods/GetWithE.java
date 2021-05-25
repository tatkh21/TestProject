package replit_project.methods;
import java.util.Scanner;
import java.util.Arrays;
public class GetWithE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        String fewValuesString = "";

            for (String each : arr) {
                if (each.contains("e")){
                    fewValuesString +=  each + " ";
                }
            } String [] fewValues = fewValuesString.split(" ");







        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }

}
