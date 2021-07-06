package day02_println_practice;

public class PrintNumbers {
    public static void main (String[]args){
        System.out.println(10+20);
        System.out.println(777);
        System.out.println("555");
        System.out.println(5.3);
        System.out.println(123456.893020);
        int n = -23;
        n = Math.abs(n);
        System.out.println(n);

        System.out.println(nearHundred(-101));

    }
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
