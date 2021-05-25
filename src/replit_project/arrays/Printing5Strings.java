package replit_project.arrays;
import java.util.Scanner;
public class Printing5Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        String tempStr = "";

        for (int j = 0; j < arr.length; j++) {
            tempStr = new String(arr[j]);
            for (int a = 0; a < tempStr.length(); a++) {
                if (a > 2) {
                    break;
                } else {
                    System.out.print(tempStr.charAt(a) + "");
                }
            } System.out.println();
        }


    }
}


