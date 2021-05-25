package day29_nestedloop_arrays;

public class Multiplication2 {
    public static void main(String[] args) {

        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t | \t");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t | \t");
            }
            System.out.println("");
        }
    }

}
