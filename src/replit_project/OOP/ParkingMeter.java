package replit_project.OOP;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    ParkingMeter(int a) {
        maxTime = a;
    }
    public boolean add(int b) {
        if (b == 25 && timeLeft <= maxTime) {
            timeLeft += 30;
            return true;
        } return false;
    }
    public void tick() {
       if (timeLeft > 0)
           timeLeft--;
    }
    public boolean isExpired () {
         if (timeLeft == 0) {
             return true;
         } return false;
    }

}
