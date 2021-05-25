package replit_project.loops;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     long n = scan.nextInt();
     for (long i = n-1 ; i > 0; i--) {
         n *= i;
     } System.out.println(n);


    }
}
