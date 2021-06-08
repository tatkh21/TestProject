package office_hours.practice_06_08_2021;

public class Shape {
    /*. Create a class called Shape
- variables: area, perimeter
- methods: calculateArea(), calculatePerimeter()

2. Create sub classes of Shape: Circle, Rectangle, Square
- give the instance variables that are needed to calculate the Area, perimeter, of those shapes

     */
    double area;
    double perimeter;
    public void calculateArea() {
        System.out.println("Shape area");
    }
    public void calculatePerimeter() {
        System.out.println("Shape perimeter");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
