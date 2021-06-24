package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoDrive();
    //void selfPark(); this causes error in subclasses, because they must override abstract method
    public default void selfPark() {
        System.out.println("performing ");
    }
}
