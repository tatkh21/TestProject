package day26_loop_practice;

public class countMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;
        for (int i = 0 ; i < word.length(); i++) {
            if (word.charAt(i)== letter) {
                count++;
            }
        }
        System.out.println("there are " + count + " " + letter + " in java");
    }
}
