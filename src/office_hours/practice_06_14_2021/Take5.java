package office_hours.practice_06_14_2021;
/*
Create a class Take5 [Child class]
    * Inherits Candy class
    * constructor that invokes the parent constructor
    * extra: static hiding, final

 */

public class Take5 extends Candy {
    public Take5( int quantity, boolean hasPeanuts) {
        super("Reeses", quantity, hasPeanuts);
    }
}
