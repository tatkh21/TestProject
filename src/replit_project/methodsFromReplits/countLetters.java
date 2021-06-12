package replit_project.methodsFromReplits;

public class countLetters {
    public static void main(String[] args) {


        String letters = "aabbbccdd";
        System.out.println(countLetters1(letters));
    }
    public static String countLetters1(String str){
        String lettersCount = "";

        for (int i = 0; i < str.length(); i++) {
           int count = 0;
            if (lettersCount.contains("" + str.charAt(i))) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            } lettersCount += "" + count + str.charAt(i);
        } return lettersCount;
    }

}
