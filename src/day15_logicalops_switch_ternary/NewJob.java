package day15_logicalops_switch_ternary;

public class NewJob {
    public static void main (String[]args){
        // location, salary, remote, benefits
        String location = "LA";
        double salary = 100_000;
        boolean isRemote = false;
        boolean hasBenefits = true;
        if(location.equals("Houston") && isRemote && salary >= 100_000 && hasBenefits){
            System.out.println("That is my dream job, I will accept this offer");
        } else if (location.equals("Houston")|| isRemote && salary >= 100_000 && hasBenefits) {
            System.out.println("Let's negotiate this offer");
        } else {
            System.out.println("Let's consider another offer");
        }

    }
}
