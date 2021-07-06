package day59_polymorphism_exaptions;

import day57_abstraction_polimorphysm_abstractclass_over_interface.shapes.Circle;
import day57_abstraction_polimorphysm_abstractclass_over_interface.shapes.Shape;
import day57_abstraction_polimorphysm_abstractclass_over_interface.shapes.Square;

public class InstanseOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if (shape instanceof Circle) {
            System.out.println("It is a circle");
        }  else if (shape instanceof  Square) {
            System.out.println("It is a square object");
        }
        /**
         * java reflection API
         */
        System.out.println(shape.getClass().getSimpleName());//just class name of object
        System.out.println(shape.getClass().getName());// class name of object and package name
        if (shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());
        System.out.println(el.getClass().getDeclaredFields().length);
    }
}
