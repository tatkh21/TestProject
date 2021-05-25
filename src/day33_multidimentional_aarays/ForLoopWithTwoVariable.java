package day33_multidimentional_aarays;

public class ForLoopWithTwoVariable {
    public static void main(String[] args) {
        for (int i = 1, j= 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("-----2 WAY FOR LOOP-----------");
        for (int i = 1, j = 5; j >= 0; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
