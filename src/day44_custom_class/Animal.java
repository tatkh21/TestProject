package day44_custom_class;

public class Animal {
    String  type = "some animal";
    public void speak() {
        System.out.println("speaking");
    }
    public void eat() {

        System.out.println(type + " eating");
    }
    public void eat(String food) {
        System.out.println("eating " + food);
    }
}
