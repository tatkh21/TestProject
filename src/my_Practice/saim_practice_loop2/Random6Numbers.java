package my_Practice.saim_practice_loop2;
import java.util.*;

public class Random6Numbers {
    public static void main(String[] args) {
        Random random = new Random();
        String randomNumber = "";
         while (randomNumber.length()!= 6) {
             int eachNumber = random.nextInt(10);
             if (!randomNumber.contains(eachNumber + "")) {
                 randomNumber += eachNumber;
             }
         }
        System.out.println(randomNumber);
    }
}
