package day10_shorthand_operators;

public class ChangeBalance {
    public static void main (String[]args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("balance = " + balance);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance = " + balance);
        //second kenafe is 50% off
        balance = balance - kenafe/2;
        System.out.println("balance = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //buy 4 iced tea
        balance = balance - icedTea * 4;
        System.out.println("balance = " + balance);
        //returning baklava
        balance = balance + baklava;
        System.out.println("balance = " + balance);

        long a = 3_000L;
        double b =(float)a;
        System.out.println(b);
        System.out.println("Result B" + (1) + (2));





    }
}
