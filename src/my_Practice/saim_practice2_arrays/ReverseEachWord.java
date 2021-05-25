package my_Practice.saim_practice2_arrays;
import java.util.Arrays;
public class ReverseEachWord {
    public static void main(String[] args) {
        String words = "It started to snow in Chicago";
        String[] wordsArr = words.split(" ");
        for (int k = 0; k < wordsArr.length; k++) {
            String temp = "";
            for (int j = wordsArr[k].length() - 1; j >= 0; j--) {
                temp += "" + wordsArr[k].charAt(j);
            }
            System.out.print(temp + " ");

//        String str = "Chicago";
//        String temp = "";
//        for  (int j = str.length()-1; j >= 0; j--) {
//            temp += "" + str.charAt(j);
//
//        } System.out.println(temp);

//        String reversed = "";
//       for (int i = 0; i < words.length-1; i++) {
//           for (int j = words[i].length()-1; j >=0; j--) {
//         }
        }


    }
}