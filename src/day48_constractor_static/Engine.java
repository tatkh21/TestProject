package day48_constractor_static;

public class Engine {
    private int cylinder;
    public Engine() {

    }

    public Engine(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getCylinder() {
        return cylinder;
    }


    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinder=" + cylinder +
                '}';
    }
}
