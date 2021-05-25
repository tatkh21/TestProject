package day14_multi_branch_if_statments;

public class LogicalAndOperator {
    public static void main (String[]args){
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println(10 > 5 && 1 == 1);//true
        System.out.println(10 > 8 && 1 == 10);//false
        System.out.println(3 > 4 && 1 == 1);//false
        System.out.println(3 ==2 && 1 < 0);//false

        int apples = 10;
        int oranges = 4;
        if ( apples > 11 && oranges > 2){
            System.out.println("We have enough fruits");
        } else {
            System.out.println("Lets go to HEB and buy more fruits");
        }



    }
}
