package replit_project.loops;
import java.util.Scanner;

public class HiString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            System.out.println(str.substring(i,i+2));
            String part =  str.substring(i,i+2);
            if (part.equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
