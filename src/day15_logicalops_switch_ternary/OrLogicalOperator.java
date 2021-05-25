package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main (String[]args){
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples =5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 3);//true
        if (apples > 3 || oranges > 4){
            System.out.println("No need to by fruits today");
        } else if(apples > 2 || oranges > 10){
            System.out.println("looks like we are good with fruts");
        } else if (apples > 5 || oranges == 0){
            System.out.println("looks like we are good with fruts");
        } else if (apples == 0 || oranges == 0) {
            System.out.println("We need to purchase more fruts ");
        }


    }
}
