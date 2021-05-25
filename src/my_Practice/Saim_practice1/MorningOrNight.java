package my_Practice.Saim_practice1;

public class MorningOrNight {
    public static void main(String[] args) {
        int time = 12;
        boolean morningTime = time >= 1 && time <= 11;
        String timeCheck = (morningTime)? "Morninng" : "Evening";
        System.out.println(timeCheck);

    }

}
