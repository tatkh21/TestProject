package day29_nestedloop_arrays;

public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++ ){
                int sum = i * j;
                System.out.print( sum + " \t");
            }
            System.out.println();
        }
    }
}
