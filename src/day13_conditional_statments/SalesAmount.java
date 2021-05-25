package day13_conditional_statments;

public class SalesAmount {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            bonus += 50;
            System.out.println("Good job, you qualified for bonus of $" + bonus);
        } else {
            bonus += 100;
            System.out.println("Great job, your bonus is $" + bonus);
        }
    }
}
