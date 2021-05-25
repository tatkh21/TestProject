package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int [] data = {32, 532, 12, 10, 123,543, 654};
         for (int i = 0; i < data.length; i++) {
             System.out.print(data[i] + " ");
         }
        System.out.println();
         for (int n : data) {
             System.out.print(n + " ");
         }
        System.out.println(data[data.length - 1]);

         for (int i = data.length -1; i >= 0 ; i--) {
             System.out.print(data[i] + " ");
         }
    }
}
