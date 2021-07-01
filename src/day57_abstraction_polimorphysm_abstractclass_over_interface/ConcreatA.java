package day57_abstraction_polimorphysm_abstractclass_over_interface;

public class ConcreatA extends AbstractA implements InterfaceA, InterfaceB  {
    @Override
    public void absMethodA() {
    }

    @Override
    public void methodB() {
        super.methodB();
    }
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " + num);
    }
}
