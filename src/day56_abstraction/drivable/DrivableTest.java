package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.start();
        model3.transportPeople();
        model3.cost(3);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.start();
        plane.cost(250);
        plane.land();
        plane.bye();

        SelfDrivable sd = new Plane();
        System.out.println(model3.getClass());
    }
}
