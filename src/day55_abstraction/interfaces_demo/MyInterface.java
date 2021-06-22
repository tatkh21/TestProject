package day55_abstraction.interfaces_demo;

public interface MyInterface {
    void learn();
}

interface MyInterface2 {

}
class MyClass implements MyInterface, MyInterface2 {

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}
class Main {
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); ERROR cannot create object
        MyClass myClass = new MyClass();
    }
}
