package day07_arithmetic_operator_casting;

public class DivisionProblem {
    public static void main (String[]arg){
        System.out.print( 10 / 3 );
        System.out.println (5 / 2);// 2

        System.out.println (10.0 / 3.0);// -> 3.333
        System.out.println (5.0 / 2.0);//->2.5

        int num1 = 40;
        int num2 = 15;

        System.out.println (num1 / num2 );
        System.out.println (5.0 / 2.0);//2.5
        System.out.println (5.0 / 2);//2.5

        double d1 = 12;
        double d2 = 3;
        System.out.println( d1 / d2 );//4.0

        d2 = 5;
        System.out.println( d1 / d2 );//2,4

        int count = 100;
        double dCount = 30.0;

        System.out.println ( count / dCount);// 3.33333333


        int n1 = 4;
        //byte b1 = (byte)n1; It will not work
        byte b1 = (byte)n1;// Now the above line will convert to bite and assing to value
         byte b2 = 55;
         int n2 = b2;// this will work because int > byte



    }
}
