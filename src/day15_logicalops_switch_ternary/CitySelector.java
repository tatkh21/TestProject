package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main (String[]args){
        String city1 = "Austin";
        if (city1.equals("Austin") || city1.equals("Dallas")) {
            System.out.println("I am willing to relocate");
        } else {
            System.out.println("Not considering to relocate");
        }
        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is Java class" + teacher);
        } else {
            System.out.println("Soft skill class with" + teacher);
        }
        // company - "Google", salary >= 100K;
        String company = "Google";
        double salary = 100_000;
        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("I will accept this offer from " + company);
        } else {
            System.out.println("Let me think about this offer from " + company);
        }
    }


}
