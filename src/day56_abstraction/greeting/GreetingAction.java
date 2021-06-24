package day56_abstraction.greeting;

public class GreetingAction {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        Japanise jp = new Japanise();
        jp.hi();
        jp.bye();

        gt = new Japanise();
        gt.hi();
        gt.bye();
    }


}
