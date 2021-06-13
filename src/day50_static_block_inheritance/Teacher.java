package day50_static_block_inheritance;

public class Teacher extends Person {
    int teacherID;

    public void teach(String topic) {
        System.out.println(name + " is teaching " + topic);
    }
}
