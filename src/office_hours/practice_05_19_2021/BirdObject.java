package office_hours.practice_05_19_2021;

public class BirdObject {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        bird1.setCanFly(true);
        System.out.println(bird1.getCanFly());
        bird1.setBeakLength(-1);
        System.out.println(bird1.getBeakLength());
    }
}
