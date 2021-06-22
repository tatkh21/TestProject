package day55_abstraction;

public abstract class Exercise {
    public void start() {
        System.out.println("Warming up and starting the exercise");
    }
    public abstract void perform();//method without a body or implementation, just signature
    // the purpose : letting subclass implement/override there own way

    /**
     * another abstract method that concreat sub classes will override/implement
     * @param minutes
     * @return
     */
    public abstract int getCaloriesCount(int minutes);
}
