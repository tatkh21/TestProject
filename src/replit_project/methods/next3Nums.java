package replit_project.methods;
import java.util.Scanner;

public class next3Nums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    // Do not touch above

    public static void next3(int num) {
        System.out.println("next 3 are:");
        int num1 = num;
        do {
            num++;
            System.out.print(num + " ");
        } while (num < num1+ 3);


    }
}
