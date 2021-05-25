package office_hours.practice_03_24_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        String biggestWordWithA = "";

        if(word1.contains("a") && word1.length() > biggestWordWithA.length()){
            biggestWordWithA = word1;
        }
        if(word2.contains("a") && word2.length() > biggestWordWithA.length()) {
            biggestWordWithA = word2;
        }
        if(word3.contains("a") && word3.length() > biggestWordWithA.length()) {
            biggestWordWithA = word3;
        }
        if (biggestWordWithA.isEmpty()) {
            System.out.println("No words contain A");
        } else {
            System.out.println("Longest word with A:" + biggestWordWithA);

        }



    }
}
