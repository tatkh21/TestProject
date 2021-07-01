package day57_abstraction_polimorphysm_abstractclass_over_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    protected final String TYPE = "abstract";
    public static final String LANGUEGE  = "java";
    public AbstractA() {
        System.out.println("AbstarctA constructor");
    }
    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB is called");
    }
    public static void staticMethodC() {
        System.out.println("static method is called");
    }
}
