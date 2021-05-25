package my_Practice.saim_practice_loop1;

public class Even_Odd_numbers {
    public static void main(String[] args) {
//        int num = 0;
//        int sum = 0;
//         while (num < 100) {
//             sum = num + num;
//             System.out.println(num + " + " + num + " = " + sum);
//             num += 2;
//         }
//         num = 1;
//         while (num < 100 && num % 2 == 1) {
//             sum = num + num;
//             System.out.println(num + " + " + num + " = " + sum);
//             num += 2;
//         }
//
//
//         int sum1 = 0;
//         for (int num1 = 0; num1 < 100; num1++){
//             if (num1 % 2 == 0) {
//                 sum1 += num1;
//             }
//         }System.out.println("sum of all even numbers = " + sum1);

        int sum2 = 0;
        for (int num1 = 0; num1 < 100; num1++){
            if (num1 % 2 == 1) {
                sum2 += num1;
            }
        }System.out.println("sum of all odd numbers = " + sum2);
    }
}
