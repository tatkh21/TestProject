package day09_scanner_practice;

public class SpeedCheck {
    public static void main (String[]args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTneLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTneLimit + "/mph over the limit. Slow down!");
    }
}
