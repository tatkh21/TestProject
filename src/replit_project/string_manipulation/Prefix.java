package replit_project.string_manipulation;
import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        String str = "abdshra";
        int num = 1;
        String prefix = str.substring(0, num);
        String seconPart = str.substring(num);
        System.out.println(seconPart.contains(prefix));

    }
}
