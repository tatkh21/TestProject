package day55_abstraction;

public class AtTheGym {
    public static void main(String[] args) {
        //Exercise exercise = new Exercise();// cannot create object of abstrarct class
        Exercise exercise = new FreeWeight();//polymorphysm benefit of abstraction
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 min - calories = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Running 30 min - calories = " + swimming.getCaloriesCount(30));



    }
}
