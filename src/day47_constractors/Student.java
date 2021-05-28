package day47_constractors;

public class Student {
    //No_args constructor
    public Student() {
        System.out.println("No-Args constructor");
    }
    public Student(String name) {
        System.out.println("name param constructor");
    }
    //constractor with age
    public Student(int age) {
        System.out.println("age paran monstractor | age = " + age);
    }
    //constractor with name and age
    public Student (int age, String name) {
        System.out.println("age&name paran monstractor | age = " + age + ", name = " + name);
    }
}
