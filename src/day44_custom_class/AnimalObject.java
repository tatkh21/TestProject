package day44_custom_class;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.type = "frog";
        animal.eat();
        animal.eat("grass");
        animal.speak();
        //create object cheetahobj
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";//change type to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
