package day16_switch_ternary;

import java.sql.SQLOutput;

/*
declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90

when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"
 */
public class CappuccinoBuyer {
    public static void main (String[]args){
        String size = "java";
        int callories = 0;
        double price = 0;
         switch (size) {
             case "tall":
                 System.out.println("Tall Cappuccino please");
                 price = 3.99;
                 callories = 120;
             break;
             case "grande":
                 System.out.println("Grande Cappuccino please");
                 price = 4.29;
                 callories = 120;
              break;
             case "venti":
                 System.out.println("Venti Cappuccino please");
                 price = 3.99;
                 callories = 120;
              break;
             default:
                 System.out.println("We do not serve this size " + size);
         }
        System.out.println("Total price: " + price + " You will consume " + callories + "cal of energy.");
    }
}
