package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoDrive() {

    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile * 25.0) + " to fly " + mile + " mile.");

    }

    @Override
    public void hi() {
        System.out.println("Welcome on board");

    }

    @Override
    public void bye() {
        System.out.println("Have a great day!");

    }

    public void land() {
        System.out.println("plane is landed!");
    }
}
