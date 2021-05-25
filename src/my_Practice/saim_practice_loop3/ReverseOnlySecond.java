package my_Practice.saim_practice_loop3;

public class ReverseOnlySecond {
    public static void main(String[]args){
        String word = "I love java";
        String reverseWord = "";
        String secondWord = word.substring(word.indexOf(" ")+1, word.lastIndexOf(" "));

        for (int j = word.lastIndexOf(" ")-1;j > word.indexOf(" " ); j--) {
                reverseWord += word.charAt(j);

            }System.out.println(word.replace(secondWord, reverseWord));


    }
}
