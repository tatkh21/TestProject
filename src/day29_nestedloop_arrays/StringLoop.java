package day29_nestedloop_arrays;

public class StringLoop {
    public static void main(String[] args) {
        String word = "java";
        String checked = "";
        for (int i = 0; i < word.length(); i++){
            char outerChar = word.charAt(i);
            int count = 0;//reset count to 0
            for (int j = 0; j < word.length(); j++) {
                char innerChar = word.charAt(j);
                if (outerChar == innerChar){// if(word.charAt(outer)== word.charAt(inner))
                    count++;
                }
            }
            System.out.println(outerChar + " = " + count);
        }
    }
}
