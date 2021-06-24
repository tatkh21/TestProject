package day56_abstraction.greeting;

public class Japanise implements Greeting{
    @Override
    public void hi() {
        System.out.println("Konnichi'a");
    }

    @Override
    public void bye() {
        System.out.println("Sayonara");

    }
}
