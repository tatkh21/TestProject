package day58_polimorphism;

public class SuperMan extends Father implements Worker{
    @Override
    public void work(String job) {
        System.out.println("Superman is working as " + job);
    }

    @Override
    public double getPayed() {
        System.out.println("Superman is getting paid");
        return 8000;
    }

    @Override
    public String toString() {
        return "SuperMan{}";
    }
}
