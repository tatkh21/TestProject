package day15_logicalops_switch_ternary;

public class CarDilership {
    public static void main(String[] args) {
        double budget = 5000;
        String model1 = "Tesla";
        double price = 5900;
        if ( budget <= 5000 && model1.equals("Toyota")|| model1.equals("Honda")|| model1.equals("Tesla") ){
            System.out.println("Ready to purchase model = " + model1 + " price = " + price);
        } else {
            System.out.println("Not interested in " + model1 + " for the price of $" + price);
        }
    }
}
