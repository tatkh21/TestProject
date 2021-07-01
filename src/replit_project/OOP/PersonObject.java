package replit_project.OOP;

public class PersonObject {
    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.getFirstName());
//        System.out.println(person.getAge());
//        person.setAge(2);
//        System.out.println(person.getAge());
//
//        Person person2 = new Person("john", "Doe", 35);
//        System.out.println(person2.getLastName());
//        System.out.println(person2.toString());
        Person teacher = new Teacher();
        teacher.setAge(25);
        teacher.setFirstName("Murodil");
        teacher.setLastName("B");
        System.out.println(teacher.toString());

    }
}
