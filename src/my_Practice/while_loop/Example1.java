package my_Practice.while_loop;

public class Example1 {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 10){
            System.out.println("Hello World!");
            count++;
        }
        int sum = 0;
        int i = 1;
        while (i <= 10){
            sum += i;
            i++;
            System.out.println("sum is " + sum);
        }
    }
}
