package replit_project.arrays1;

public class ReversedString {
    public static void main(String[] args) {
        String sentence = "Go to the moon";
        String[] strReversed = sentence.split(" ");
        String str = "";
        for (int j = strReversed.length - 1; j >= 0; j--) {
            str += strReversed[j] + " ";

        } System.out.println(str.trim());

    }
}
