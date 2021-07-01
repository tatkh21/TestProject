package day57_abstraction_polimorphysm_abstractclass_over_interface;

public interface InterfaceA  {
    public static final String Type = "intrface";
    double MAX_COUNT = 500;//this also public static final

    /**
     * ERROR: Interface CANNOT have a constractor
     *
     */

    public abstract void absMethodD(int num);
    public static void staticMethoidE (String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }
    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
