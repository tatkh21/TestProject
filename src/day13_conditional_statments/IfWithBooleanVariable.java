package day13_conditional_statments;

public class IfWithBooleanVariable {
    public static void main (String[]args){
        Boolean isHungry = false;

        if ( isHungry ){
            System.out.println("I am hungry I will go get something to eat\nThen code Java");
        } else {
            System.out.println("I am not hingry\nI will code Java");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200;

        if (isAffordable){
            System.out.println("Great you can buy it!");
        } else {
            System.out.println("sorry, you can not afford it!");
        }

        boolean isRemoteJob = true;

        if (!isRemoteJob) {
            System.out.println("Sorry, I am not interested");
        } else {
            System.out.println("Sure, what is an intrview process?");

        }


    }
}
