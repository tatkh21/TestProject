package replit_project.arrays1;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] strArr = sentence.split(" ");
        for (String each : strArr) {
            System.out.println(each);
        }
    }
}
