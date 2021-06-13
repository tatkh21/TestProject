package day50_static_block_inheritance;

public class InheritenseTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.age = 25;
        t1.name = "Saim";
        t1.talk();
        t1.walk();
        t1.work("Teacher");

        Student student = new Student();
        student.name = "Ali";
        student.age = 33;
        student.walk();
        student.talk();
        student.work("Java programmer");
        student.school = "Cybertek";
        student.studying("Java programing inheritense");
    }
}
