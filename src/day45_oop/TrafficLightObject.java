package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create object
        TrafficLight traficlight = new TrafficLight();
        //traficlight.color = "red";
        //we will assingn/update the value of color using  a method of the class
        traficlight.changeColor("red");
        //System.out.println(trafficlight.color); DIRECT access to variable, not recommended
        //call method to access the variable:
        traficlight.showColor();

        traficlight.changeColor("green");
        traficlight.showColor();

        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("green");
        trafficLight1.showColor();
        trafficLight1.changeColor("brown");
        trafficLight1.showColor();

    }
}
