package my_Practice.Saim_practice1;

public class TernaryNum {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1++ * 3 + ++num1 + num1++ % 2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int biggest = num1 > num2 ? num1 : num2;
        System.out.println(biggest);
    }
}
