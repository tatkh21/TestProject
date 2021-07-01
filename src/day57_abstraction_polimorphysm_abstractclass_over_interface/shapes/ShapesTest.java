package day57_abstraction_polimorphysm_abstractclass_over_interface.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        /**
         * create a list of shapes and store 10 different shapes
         * using a loop print out
         */
        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Square());
        listOfShapes.add(new Square());
        for (Shape each : listOfShapes) {
            each.draw();
        }
        System.out.println(circle.getClass());
    }
    public static void drawShape(Shape shape) {
        System.out.println("---Drawing shape-----");
        shape.draw();
    }
}
