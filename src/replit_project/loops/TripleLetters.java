package replit_project.loops;
import java.util.Scanner;

public class TripleLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

//aaabbbccc
        for (int i = 0; i < str.length() - 3; i++) {
            String part = str.substring(i, i + 3);
//            boolean equals = ((part.charAt(i) ==part.charAt(i+1)) && (part.charAt(i+1)== part.charAt(i+2)));
            System.out.println(part);
//             if (equals) { count++;
//            System.out.print(""+str.charAt(i));
//            System.out.print(""+str.charAt(i+1));
//            System.out.print(""+str.charAt(i+2));
//            System.out.println();
//            if (str.charAt(i)==str.charAt(i+1)&& str.charAt(i+1)==str.charAt(i+2)){
//                count++;
            }


            }
  //      System.out.println(count);



        }


