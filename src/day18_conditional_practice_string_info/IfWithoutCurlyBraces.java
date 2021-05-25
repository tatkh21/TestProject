package day18_conditional_practice_string_info;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";

        if (todayClass.equals("java"))
            System.out.println("Java is fun");
        else
            System.out.println("It is not java, it is " + todayClass);

        int score = 1;

        if (score == 1)
            System.out.println("lowest score");
        else if (score == 2)
            System.out.println("score is 2");
        else if (score == 3)
            System.out.println(score == 3);
        else
            System.out.println("Invalid number");// it will work without {} only if we
        // have one statment after if, if else, else

        int a = 1;

        if ( a == 1)
            System.out.println("a is 1");
            System.out.println( "1 is a");

    }
}
