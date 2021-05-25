package day36_methods;
import java.util.*;
public class Info {
    public static void main (String[]args) {
        fullName();// doesn't give us anything
        System.out.println("Full name = " + fullName());
        System.out.println("isMarried" + isMaried());
        System.out.println("age = " + getAge());
        System.out.println("Random year = " + getRandomYear());
        System.out.println("Random year = " + getRandomYear());
        System.out.println("Random year = " + getRandomYear());
        String name = fullName();
        boolean married = isMaried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMaried()) {
            System.out.println("married = " + married);
        }
    }
    public static String fullName() {
       // System.out.println("Inside fullName method");
        return "Tatyana";
    }
    public static boolean isMaried() {
        return true;
    }
    public static int getAge(){
        int age = 43;
        return age;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
