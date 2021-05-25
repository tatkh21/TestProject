package day30_arrays;
/*
id
lastname
firstname
batch
phoneNumber
 */
public class StudentArray {
    public static void main(String[] args) {
        String[] student = new String[5];
        student[0] = "23456";
        student[1] = "Khud";
        student[2] = "Daur";
        student[3] = "B22";
        student[4] = "345-404-2441";

        String[] student1 = {"1234", "Khud", "Tat", "22", "346-404-2425"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 last name =  " + student1[1]);
        System.out.println("student1 first name = " + student1[2]);
        System.out.println("student batch = " + student1[3]);
        System.out.println("student phone number = " + student1[4]);
        System.out.println("student data length : " + student1.length);

        // check if student1 data array contains 5 items.
        // true: Student1 data array has correct length
        // false: FAIL: data array has incorrect length

        if (student1.length == 5) {
            System.out.println("data array has correct length");
        } else {
            System.out.println("data array has incorrect length");
        }
        if (student.length == student1.length) {
            System.out.println("data arrays length match");
        } else {
            System.out.println("data arrays length mismatch");

        }
        System.out.println((student[1] + " " + student[2]).toUpperCase());
        String mobilePhone = student1[4];
        System.out.println(mobilePhone.length());
        System.out.println(mobilePhone.startsWith("346"));
    }
}
