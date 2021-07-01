package day57_abstraction_polimorphysm_abstractclass_over_interface.polymorphism;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Dog is barking gav,gav, woof, woof");
    }
}
