package office_hours.practice_06_14_2021;

public class Twix extends Candy{
    /*
    Create a class Twix [Child class]
    * Inherits Candy class
    * constructor that invokes the parent constructor
    * extra: static hiding, final, sub class
     */

    public Twix( int quantity, boolean hasPeanuts) {
        super("Mars", quantity, hasPeanuts);
    }
}
