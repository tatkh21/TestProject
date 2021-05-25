package day12_conditional_statment;

public class IfElseStatement {
    public static void main (String[]args){
        if(10 > 5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }

        int count = 25;
        // check if count is more than 30
        // otherwise print "count is  less
        if (count > 30){
            System.out.println("COUNT IS MORE THAN 30");
        } else {
            System.out.println("COUNT IS LESS THAN 30");
        }

        byte age = 25;
        if (age > 18) {
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
            System.out.println("Age is greater or equal to 18");
        } else {
            System.out.println("YOU ARE NOY ELIGIBLE TO VOTE");
            System.out.println("Age is less that 18");
        }
    }
}
