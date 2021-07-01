package day57_abstraction_polimorphysm_abstractclass_over_interface.polymorphism;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();// not polomorphic, data type and object type are the same
        a1.makeNoise();
        //Polymorphism polimorphic way;
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        ArrayList<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cat());
        listOfAnimals.add(new Cat());
        for (Animal each : listOfAnimals) {
            each.makeNoise();
        }
        System.out.println(animal1.getClass());

    }
}
