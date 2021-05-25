package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz number: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz number: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz number: "+ i);
            } else {
                System.out.println(i);
            }

        }
    }
}
