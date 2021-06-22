package day55_abstraction;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing Running exercise");
    }

    /**
     *
     * @param minutes - how long is the exercise performed
     * @return we are assuming
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
