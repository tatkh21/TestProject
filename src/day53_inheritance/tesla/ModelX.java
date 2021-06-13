package day53_inheritance.tesla;

public class ModelX extends ElectricCar{

    public ModelX(String model, String make, double price, int year, int range) {
        super(model, make, price, year, range);
    }
    /**
     ERROR below , because charge is final method. cannot be overridden
     */
//    public void charge() {
//
//    }
}
