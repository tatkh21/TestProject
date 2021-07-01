package replit_project.OOP;

public class Teacher extends Person{
    @Override
    public String toString() {
        return "Teacher{" + "lastName='" + getLastName() + '\'' +
                ", firstName=" + getFirstName() +
              ", age=" + getAge() +
               '}';
    }
}
