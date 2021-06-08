package office_hours.practice_06_08_2021;

public class Circle extends Shape {

    double radius;

    double diameter;

    @Override
    public void calculateArea() {
        area = Math.PI * radius *radius;
        //Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
       perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
