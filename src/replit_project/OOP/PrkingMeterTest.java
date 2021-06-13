package replit_project.OOP;

public class PrkingMeterTest {
    public static void main(String[] args) {
        ParkingMeter pm = new ParkingMeter(30);
        pm.add(25);
        pm.tick();
        System.out.println("pm.timeLeft = " + pm.timeLeft);
        System.out.println("pm.isExpired() = " + pm.isExpired());
    }
}
