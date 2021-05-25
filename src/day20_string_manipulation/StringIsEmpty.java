package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = " ";
        System.out.println(jobTitle.isEmpty());
        if (jobTitle.isEmpty()) {
            System.out.println("Job title is empty, please resend");
        } else {
            System.out.println("Job title looks good");
        }
        if (jobTitle.length()==0) {
            System.out.println("jobTitle is empty");
        } else {
            System.out.println("jobTitle is not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty());//false
        System.out.println(word.length());//1. blank space is a character

        String veggie = "carrot";
        System.out.println(veggie.isEmpty());//false
        if (!veggie.isEmpty()) {
            System.out.println("We have " + veggie);
        }
        String word1 = "java";
        System.out.println(word1.contains("v"));// true
        System.out.println(word1.contains("va"));// true
        System.out.println(word1.contains("jv"));//false
        System.out.println(word1.contains("Ja"));// false




    }
}
