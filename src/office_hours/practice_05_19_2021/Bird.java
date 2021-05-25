package office_hours.practice_05_19_2021;

public class Bird {

    // Bird bird = new Birds();
    //bird.setSpecies();
    private  String bird;
    private boolean canFly;
    private double beakLength;
    private  String planet = "Earth";

    public String getPlanet() {
        return planet;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        if (bird == null || bird.isEmpty()) {
            return;
        }
        this.bird = bird;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
//        if (beakLength < 0 ){
//            return;
//        }
//        this.beakLength = beakLength;
        if (beakLength > 0) {
            this.beakLength = beakLength;
        } else {
            System.out.println("Invalid length");
        }
    }
}
