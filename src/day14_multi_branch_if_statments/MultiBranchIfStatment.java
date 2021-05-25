package day14_multi_branch_if_statments;

public class MultiBranchIfStatment {
    public static void main(String[] args) {
        int day = 8;
        if (day == 1) {
            System.out.println("Today is Monday");
        } else if (day == 2) {
            System.out.println("Today is Tuesday");
        } else if (day == 3) {
            System.out.println("Today is Wednesday");
        } else if (day == 4) {
            System.out.println("Today is Thursday");
        } else if (day == 5) {
            System.out.println("Today is Friday");
        } else if (day == 6) {
            System.out.println("Today is Saturday");
        } else if (day == 7) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Incorrect  input ");
        }


        System.out.println("Every day is Java day");
    }
}

