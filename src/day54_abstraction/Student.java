package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is codding using " + language);
    }
    public abstract void attendClass();
}



