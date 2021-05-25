package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "java is fun";
        String[] strArr = str.split(" ");
        String reversed = "";
        for (int i = strArr.length-1; i >= 0; i--) {
            reversed += strArr[i]+ " ";

        } System.out.print(reversed.trim());
    }
}
