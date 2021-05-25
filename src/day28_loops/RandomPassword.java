package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789_!@#$%^&*()_+";
        Random random = new Random();
        String password = "";

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(71);//random num 0 -70
            password += source.charAt(index);
            //source.substring(index, index+1);
            //System.out.println(random.nextInt(source.length()));
        }
        System.out.println("password = " + password);

    }
}
