package day05_primitives_concatination;

public class JobInfo {
    public static void main (String[]args){
        String title = "Java SDET";
        String company = "Cybertek";
        String jobDescription = "Experienced Java, Selenium, Cucumber, JUnit";
        double salary = 123000;
        byte yearsOfExperience = 3;
        boolean hasBenefits = true;
        System.out.println ("Job Title is " + title);
        System.out.println ("Company is " + company);
        System.out.println ("Job description: " + jobDescription);
        System.out.println ("Salary: $" + salary);
        System.out.println ("Years of experiense: " + yearsOfExperience + " years");
        System.out.println ("Has benefits? " + hasBenefits);
    }
}
