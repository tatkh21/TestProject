package replit_project.methodsFromReplits;

public class LimitChars {
    public static void main(String[] args) {
        String str = "bla bla bla";
        int count = 3;
        System.out.println(limit(str, count));
    }
    public static String limit(String text, int maxLength) {
        String newText = text.substring(0, maxLength);
        return newText;

    }
}
