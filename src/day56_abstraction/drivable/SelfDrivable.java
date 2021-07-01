package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoDrive();
    //void selfPark(); this causes error in subclasses, because they must override abstract method
    public default void selfPark() {////if we add default method, it will prevent errors
        System.out.println("performing self-parking");
    }
}
