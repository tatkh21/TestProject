package replit_project.OOP;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    firstName = "undefined";
    lastName = "undefined";
    age = -1;
}
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getLastName () {
        return lastName;
    }
    public String getFirstName () {
        return firstName;
    }
    public int getAge () {
        return age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }
//    @Override
//    public String toString() {
//        return "Person{" +
//                "lastName='" + getLastName() + '\'' +
//                ", firstName=" + firstName +
//                ", age=" + age +
//                '}';




}
