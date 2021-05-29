package day48_constractor_static;

public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(6);

        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver ("Aziz");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

        //print Driver name of metrobus
        System.out.println(metroBus.driver.getName());
    }

}
