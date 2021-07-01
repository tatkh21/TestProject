package day57_abstraction_polimorphysm_abstractclass_over_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA = new AbstractA();// Cannot create an object from abstract class
        //InterfaceA iA = new InterfaceA();// cannot create an object from interface
        InterfaceA.staticMethoidE("wooden spoon");
        //ConcreatA.staticMethoidE();
    }
}
