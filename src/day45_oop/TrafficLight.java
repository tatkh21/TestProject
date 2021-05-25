package day45_oop;

public class TrafficLight {
    String color;

    public void showColor() {
        System.out.println("current color = " + color);
    }
    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")) {
            System.out.println("changing color to " + newColor);
            color = newColor;
        } else {
            System.out.println("ERROR: invalid color");
        }

    }
}
