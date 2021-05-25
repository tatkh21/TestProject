package day19_class_vs_object_string;

public class StringstartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("intellij idea"));//true
        System.out.println(word.endsWith("ea"));//true
        System.out.println("java".startsWith("j") );//true
        System.out.println(word.startsWith("I"));
        /*

        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Dr. Nadir";

        if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mr.")){
            System.out.println("Man");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }


    }
}
