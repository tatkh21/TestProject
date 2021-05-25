package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main (String[]args){
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("Congratulations, you just perchased " + itemName);
        } else {
            System.out.println(itemName + " is not on sale or does not have free shipping");
        }
        if (onSale && freeShipping && itemName.equals("wooden spoon")){
            System.out.println("Congratulations, you just perchased " + itemName);
        } else {
            System.out.println("Keep shopping");
        }

    }

}
