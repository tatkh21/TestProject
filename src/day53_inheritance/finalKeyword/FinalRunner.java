package day53_inheritance.finalKeyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TesData.ADMIN_USERNAME);
       // TesData.ADMIN_USERNAME = "change";ERROR: cannot change value of final variable
        final int SSN = 431274829;
        //SSN = 3299393889; ERROR  variable is final

    }
}
