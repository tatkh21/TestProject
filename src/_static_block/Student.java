package _static_block;
                    //IS-A relationship
public class Student extends Person {
    int studentID;
    String school;

    public void studying (String subject) {
        System.out.println(name + " is studying " + subject + " at " + school);
    }


}
