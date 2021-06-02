package replit_project.methodsFromReplits;

public class PrintUniqueWord {
    public static void main(String[] args) {
        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[i]);
            } count = 0;
        }
    }
}
