package replit_project.methodsFromReplits;

public class CleanString {
    public static void main(String[] args) {
        String text = "foo bla bla foo hi  how are you bla";
        String badWord = "bla";
        System.out.println(clean(text, badWord));
    }
    public static String clean(String text, String badWord) {
        String cleanStr = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(badWord)) {
                cleanStr += words[i].replace(badWord,"");
            } else {
                cleanStr += words[i] + " ";
            }
        }

        return cleanStr.trim();
    }
}
