package day57_abstraction_polimorphysm_abstractclass_over_interface.polymorphism;

public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Cat is saying <meoy meou> ");
    }
}
