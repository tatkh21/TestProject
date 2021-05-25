package my_Practice.book_practice;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random()*10);
        int number2 = (int) (Math.random()*10);
        System.out.println("what is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();
        while (answer != number1 + number2){
            System.out.println(answer + " is incorrect.Try again. What is " + number1 + " + " + number2 + " ?");
            answer = input.nextInt();

        }
        System.out.println(answer + " is correct");

        int num1 = 10;
        int num2 = 11;
        System.out.println("what is " + num1 + " + " + num2 + " ?");
        int answer1 = input.nextInt();
        int count = 0;

            while (answer1 != num1 + num2){
            System.out.println(answer1 + " is incorrect.Try again. What is " + num1 + " + " + num2 + " ?");
            answer1 = input.nextInt();


        }
        System.out.println(answer1 + " is correct");


    }

}
