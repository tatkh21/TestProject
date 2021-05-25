package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS");

        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\n ODD NUMBERS");

        for (int k = 0; k <= 100; k++) {
            if (k % 2 != 0){
                System.out.print(k + " ");
            }
        }

    }

}
