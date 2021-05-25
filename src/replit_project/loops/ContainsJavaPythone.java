package replit_project.loops;
import java.util.Scanner;

public class ContainsJavaPythone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0;
        while (sentence.contains("java") || sentence.contains("python")){
            if (sentence.contains("java")){
                countJava++;
                sentence= sentence.replaceFirst("java", "");
            } else if (sentence.contains("python")) {
                countPython++;
                sentence = sentence.replaceFirst("python", "");
            }
        }
        System.out.println(countJava==countPython);
    }
}
