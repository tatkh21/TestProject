package my_Practice.saim_practice_loop1;
import java.util.Scanner;
public class Dynamic_Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("upper or lower");
        String answer = scan.next();
        System.out.println("ascending or descending");
        String ascendingOrDescaending = scan.next();
        int starting = 0;
        int ending = 0;
        if (answer.equalsIgnoreCase("upper")){
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }
        if (ascendingOrDescaending.equals("ascending")) {
            for (int i = starting ;i <= ending ;i++) {
                System.out.print((char)i+"");
            }
        }else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char)i+"");
            }
        }




    }
}
