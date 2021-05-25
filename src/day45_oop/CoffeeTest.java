package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink = " + myCoffee.getAmount());
        // NOT myCoffee.type = "Turkish coffee"
        myCoffee.setType("Turkish coffee");
        System.out.println("coffee type = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee type = " + coffee1.getType());
        //assign coffee1 object to coffee1
        //
        Coffee coffee2 = coffee1;
        System.out.println("coffee type = " + coffee2.getType());
        coffee2.setType(("Espresso"));
        System.out.println("coffee type for coffee1 = " + coffee1.getType());
        System.out.println("coffee type for coffee2 = " + coffee2.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        System.out.println();

        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null;//reference variable does not refer to any object  in HEAP
        //coffee4.setType("turkish");// wil return NullPointerExeptions






    }
}
