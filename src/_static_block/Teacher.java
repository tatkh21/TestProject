package _static_block;

public class Teacher extends Person {
    int teacherID;

    public void teach(String topic) {
        System.out.println(name + " is teaching " + topic);
    }
}
