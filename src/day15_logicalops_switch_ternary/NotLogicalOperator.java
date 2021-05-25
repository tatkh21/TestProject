package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main (String[]args){
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
        int age = 2;
        // check if age is not more than 7. print "Need to seat in child carseat"
        if ( !(age > 7)) {
            System.out.println("You need to seat in child carseat. age = " + age);
        } else {
            System.out.println("can seat in passenger seat. age = " + age);
        }
        boolean isSmokingAllowed = false;
         if (!isSmokingAllowed){
             System.out.println("Lets find another place");
         }
         boolean isAffordable = true;
         if (!isAffordable) {
             System.out.println("Item not affordable");
         }else {
             System.out.println("Lets buy it");
         }
         String carModel = "Tesla";
         if (!carModel.equals("Tesla")){
             System.out.println("Not interested, thank you");
         }
         String secretpassword = "abc123";
         String inputpassword = "123abc";
         if (!inputpassword.equals("abc123")){
             System.out.println("Incorrect password " + secretpassword);
         }
         if (!inputpassword.equals(secretpassword)){
             System.out.println("Incorrect password");
         }


    }
}
