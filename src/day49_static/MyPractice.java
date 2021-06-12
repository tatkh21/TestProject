package day49_static;

public class MyPractice {
    static String name = "John";
    int id = 123;

    public static void main(String[] args) {
        System.out.println("name = " + name);
        //System.out.println("id = " + id); we can not print it this way
        // because id is not static variable
    }
}
